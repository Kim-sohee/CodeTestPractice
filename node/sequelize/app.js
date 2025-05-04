//필요한 모듈 불러오기
const express = require('express');
const path = require('path');
const morgan = require("morgan");
const nunjucks = require('nunjucks');

const { sequelize } = require('./models');
const indexRouter = require('./routes');
const usersRouter = require('./routes/users');
const commentsRouter = require('./routes/comments');

const app = express();   // Express 애플리케이션 생성

//포트 설정 (환경 변수 PORT가 있으면 사용하고, 없으면 3001 사용)
app.set('port', process.env.PORT || 3001);

// 뷰 엔진 설정
app.set('view engine', 'html');

// Nunjucks 템플릿 엔진 설정
nunjucks.configure('views', {
    express: app,
    watch: true,
});

// Sequelize를 이용한 DB 연결 (force: false => 기존 테이블 유지)
sequelize.sync({force: false})
        .then(()=>{
            console.log('데이터베이스 연결 성공');
        })
        .catch((err)=>{
            console.error(err);
        });

app.use(morgan('dev'));    // HTTP 요청 로그를 개발자-friendly 형식으로 출력
app.use(express.static(path.join(__dirname, 'public')));
app.use(express.json());
app.use(express.urlencoded({extended: false}));

app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/comments', commentsRouter);

// 존재하지 않는 라우터 처리 미들웨어 (404 에러 발생)
app.use((req, res, next)=>{
    const error = new Error(`${req.method} ${req.url} 라우터가 없습니다.`);
    error.status = 404;
    next(error);
});
// 에러 처리 미들웨어
app.use((err, req, res, next)=>{
    res.locals.message = err.message;
    // 개발환경에서만 에러 전체 출력
    res.locals.error = process.env.NODE_ENV !== 'production' ? err : {};
    res.status(err.status || 500);
    res.render('error');
});

// 서버 실행
app.listen(app.get('port'), ()=>{
    console.log(app.get('port'), '번 포트에서 대기 중');
});