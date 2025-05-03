const array = [7, 77, 17];
// console.log(solution1(array));

function solution1(array){
    array = array.join('').split('');
    return array.filter(x => x=='7').length;
}

const a = "hello";
const b = "ohell";
// console.log(solution2(a,b));

function solution2(a, b){
    var answer = 0;

    for(var i=0; i<a.length; i++){
        if(a !== b){
            a = a.slice(-1, ) + a.slice(0, -1);
            answer++;
        }
        
    }
    return answer > a.length ? -1: answer;
}

const n = 1234;
// console.log(solution3(n));

function solution3(n){
    var answer = String(n).split('');
    return answer.map(x=> Number(x)).reduce((a,b)=>{return a+b;}, 0);
}

const quiz = ["3 - 4 = -3", "5 + 6 = 11"];
// console.log(solution4(quiz));

function solution4(quiz){
    var answer = [];
    quiz.forEach(element => {
        const [expression, result] = element.split(" = ");
        const [num1, operator, num2] = expression.split(" ");

        let calculatedResult;
        if (operator === "+") {
            calculatedResult = parseInt(num1) + parseInt(num2);
        } else if (operator === "-") {
            calculatedResult = parseInt(num1) - parseInt(num2);
        }

        calculatedResult === parseInt(result) ? answer.push("O") : answer.push("X");
    });

    return answer;
}