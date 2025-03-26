/* 하루에 5문제 이상 코드 테스트를 공부하기로 합니다. */

// 1.등수매기기 (lv.0)
// 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

const score = [[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]];
// console.log(solution1(score));

function solution1(score){
    let average = score.map(x=> (x[0]+x[1])/2);

    let rank = average.map(x=>[...average].sort((a,b)=> b-a).indexOf(x)+1);

    return rank;
}

// 2. 치킨 쿠폰
// 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.

const chicken = 1081;
console.log(solution2(chicken));

function solution2(chicken){
    var result = 0;
    var coupons = chicken; 
   
    while(coupons >= 10){
        let service = Math.floor(coupons/10);
        result += service;
        coupons = service + (coupons % 10);
    }

    return result;
}