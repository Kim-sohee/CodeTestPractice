// 1. 종이 자르기 (lv.0)
// 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
// 정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.

const M = 2;
const N = 2;
// console.log(solution1(M, N));

function solution1(M, N){
    return M * N - 1;
}

// 2. 문자열 정렬하기(2) (lv.0)
// 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
const my_string = "heLLo";
// console.log(solution2(my_string));

function solution2(my_string){
    let answer = my_string.toLowerCase().split('');
    return answer.sort().join('');
}

// 3. 크기가 작은 부분문자열 (lv.1)
// 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
const t = "3141592";
const p = "271";
// console.log(solution3(t, p));

function solution3(t, p){
    let answer = []
    const len = p.length;

    for(var i=0; i<=t.length-len; i++){
        answer.push(t.slice(i, i+len));
    }

    return answer.filter(num => num <= p).length;
}

// 4. 콜라 문제 (lv.1)
//  빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제입니다. 기존 콜라 문제와 마찬가지로, 보유 중인 빈 병이 a개 미만이면, 추가적으로 빈 병을 받을 순 없습니다.
const a = 2;
const b = 1;
const n = 20;
// console.log(solution4(a, b, n));

function solution4(a, b, n){
    var answer = 0;

    while(n >= a){
        answer += parseInt(n/a)*b;
        n = parseInt(n/a)*b + n%a;
    }
    
    return answer;
}

// 5. 기사단원의 무기 (lv.1)
/* 숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.
각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다. 단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고, 제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.
예를 들어, 15번으로 지정된 기사단원은 15의 약수가 1, 3, 5, 15로 4개 이므로, 공격력이 4인 무기를 구매합니다. 만약, 이웃나라와의 협약으로 정해진 공격력의 제한수치가 3이고 제한수치를 초과한 기사가 사용할 무기의 공격력이 2라면, 15번으로 지정된 기사단원은 무기점에서 공격력이 2인 무기를 구매합니다. 무기를 만들 때, 무기의 공격력 1당 1kg의 철이 필요합니다. 그래서 무기점에서 무기를 모두 만들기 위해 필요한 철의 무게를 미리 계산하려 합니다.
기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때, 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오*/
const number = 10;
const limit = 3;
const power = 2;
console.log(solution5(number, limit, power));

function solution5(number, limit, power) {
    let answer = new Array(number + 1).fill(0);

    for (let i = 1; i <= number; i++) {
        for (let j = i; j <= number; j += i) {
            answer[j]++;
        }
    }

    return answer.slice(1).reduce((sum, count) => sum + (count > limit ? power : count), 0);
}
