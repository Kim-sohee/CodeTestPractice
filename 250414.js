const s = "abcde";
// console.log(solution(s));
function solution(s) {
    let len = s.length;
    return len % 2===0 ? s.slice(len/2-1, len/2+1): s.slice(len/2, len/2 +1);
}

const arr = [4,3,2,1];
// console.log(solution1(arr));

function solution1(arr){
    var answer = arr.filter(x=> x!== Math.min(...arr));
    return answer.length > 0 ? answer : [-1];
}

const left = 24;
const rigth = 27;
// console.log(solution2(left, rigth));

function solution2(left, right){
    let answer = 0;

    for (let i = left; i <= right; i++) {
        let count = 0;
        for (let j = 1; j <= i; j++) {
            if (i % j === 0) count++;
        }
        if (count % 2) answer -= i;
        else answer += i;
    }

    return answer;
}

const arr1 = [[1,2],[2,3]];
const arr2 = [[3,4],[5,6]];
// console.log(solution3(arr1, arr2));

function solution3(arr1, arr2){
    var answer = [[]];
    for(var i=0; i<arr1.length; i++){
        answer[i] = [];
        for(var j=0; j<arr1[i].length; j++){
            answer[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    return answer;
}

const n = 3;
const m = 12;
// console.log(solution4(n, m));

function solution4(n,m){
    let gcdfuc = (a, b) => {
        while (b !== 0) {
            let temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    };

    const gcd = gcdfuc(n,m);
    const lcm = Math.abs(n*m) / gcd;
    return [gcd, lcm];
}

const n1 = 45;
// console.log(solution5(n1));

function solution5(n){
    var ternary = "";
    while(n>0){
        ternary = (n%3) + ternary;
        n = Math.floor(n/3);
    }
    var answer = 0;
    [...ternary].forEach((x, i)=>{
        answer += x * Math.pow(3, i);
    });

    return answer;
}
