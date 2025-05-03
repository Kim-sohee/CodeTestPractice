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

// 2. 치킨 쿠폰 (lv.0)
// 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.

const chicken = 1081;
// console.log(solution2(chicken));

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

// 3. 연속된 수의 합 (lv.0)
// 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

const num = 5;
const total = 5;
// console.log(solution3(num, total));

function solution3(num, total){
    var answer = [];
    var start = parseInt(total/num) - parseInt((num-1)/2);
    
    while(num){
        answer.push(start);
        start++;
        num--;
    }

    return answer;
}

// 4. 카드 뭉치 (lv.1)
/* 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.

- 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
- 한 번 사용한 카드는 다시 사용할 수 없습니다.
- 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
- 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
- 예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"], 두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"] 순서의 단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서 "want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.

문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.*/

const cards1 = ["i", "water", "drink"];
const cards2 = ["want", "to"];
const goal = ["i", "want", "to", "drink", "water"];
//console.log(solution4(cards1, cards2, goal));

function solution4(cards1, cards2, goal){
    var answer = "Yes";
    goal.forEach(element => {
        if(cards1.indexOf(element) === 0){
            cards1.shift();
        }else if(cards2.indexOf(element) === 0){
            cards2.shift();
        }else{
            answer = "No";
        }
    });
    return answer;
}

// 5. 과일 장수 (lv.1)
/* 사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때, 과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.
- 한 상자에 사과를 m개씩 담아 포장합니다.
- 상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.

예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면, 다음과 같이 [2, 3, 2, 3]으로 구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.
(최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8*/

const k = 3;
const m = 4;
const score1 = 	[1, 2, 3, 1, 2, 3, 1];
// console.log(solution5(k, m, score1));

function solution5(k, m, score) {
    let answer = 0;
    score.sort((a,b)=> a-b);

    while(score.length >= m){
        const box = score.splice(score.length - m, m);
        answer += m * Math.min(...box);
    }
    return answer;
}
