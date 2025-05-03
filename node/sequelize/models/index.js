// Sequelize 패키지 불러오기
const Sequelize = require('sequelize');

// 모델 정의 파일 불러오기
const User = require('./user');
const Comment = require('./comment');

// 환경 변수 설정 (기본값은 'development')
const env = process.env.NODE_ENV || 'development';

// 환경에 맞는 데이터베이스 설정 정보 불러오기
const config = require(__dirname + '/../config/config.json')[env];

// 데이터베이스 객체 생성 (이 객체에 sequelize 인스턴스와 모델들을 저장)
const db = {};

// Sequelize 인스턴스 생성 (DB 연결을 위한 객체)
const sequelize = new Sequelize(config.database, config.username, config.password, config);

// 생성한 Sequelize 인스턴스를 db 객체에 저장
db.sequelize = sequelize;

// 모델들을 db 객체에 등록
db.User = User;
db.Comment = Comment;

// 각 모델에 Sequelize 연결 (init 메서드 실행)
User.init(sequelize);
Comment.init(sequelize);

// 모델 간의 관계 설정 (associate 메서드 실행)
User.associate(db);
Comment.associate(db);

// db 객체 내보내기 (다른 파일에서 사용할 수 있도록)
module.exports = db;