// 1. 숫자 (lv.1)
function solution(s) {
    return (s.length === 4 || s.length === 6) && /^[0-9]+$/.test(s);;
}

// 2. 예산 (lv.1)
const d = [1,3,2,5,4];
const budget = 9;
// console.log(solution2(d, budget));

function solution2(d, budget){
    var count = 0;
    d = d.sort((a,b)=> a-b);
    
    for(var i of d){
        if(budget >= i){
            budget -= i;
            count++;
        }else{
            break;
        }
    }
    return count;
}

// 3. 최소직사각형 (lv.1)
// 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
const size = [[60, 50], [30, 70], [60, 30], [80, 40]];
// console.log(solution3(size));

function solution3(size){
    let width = [];
    let hight = [];

    size.forEach(element => {
        if(element[0]> element[1]){
            width.push(element[0]);
            hight.push(element[1]);
        }else{
            width.push(element[1]);
            hight.push(element[0]);
        }
    });

    return Math.max(...width) * Math.max(...hight);
}

//4. 이상한 문자 만들기 (lv.1)
// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
const s = "try hello world";
// console.log(solution4(s));

function solution4(s){
    var answer = [];
    s = s.split(" ");
    s.forEach(x=>{
        let convert = [...x].map((e, idx)=> idx%2===0 ? e.toUpperCase(): e.toLowerCase()).join('');
        answer.push(convert);
    })
    return answer.join(" ");
}

// 5. 숫자 문자열과 영단어 (lv.1)
// 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
const s1 = "one4seveneight";
console.log(solution5(s1));

function solution5(s){
    const convert = ["zero","one","two","three","four","five","six","seven","eight","nine"];

    for(var i=0; i<convert.length; i++){
        s = s.replaceAll(convert[i], i);
    }

    return Number(s);
}