const s = "hello";
// console.log(solution1(s));

function solution1(s){
    var check = [...new Set(s.split(""))];
    var answer = [];
    check.forEach(element =>{
        if(s.indexOf(element) === s.lastIndexOf(element)){
            answer.push(element);
        }
    })
    return answer.sort().join('');
}

const my_string = "abCdEfghIJ";
// console.log(solution2(my_string));

function solution2(my_string){
    var answer = '';
    [...my_string].forEach(str=>{
        if(str.match(new RegExp(/^[A-Z]/)) !== null){
            answer += str.toLowerCase();
        }else{
            answer += str.toUpperCase();
        }
    });
    return answer;
}

const before = "allpe";
const after = "apple";
// console.log(solution3(before, after));

function solution3(before, after){
    [...before].forEach(x=>{
        after = after.replace(x, "");
        console.log(after);
    });
    
    return after.length > 0 ? 0: 1;
}

const i = 1;
const j = 13;
const k = 1;
console.log(solution4(i,j,k));

function solution4(i, j, k){
    var answer = '';

    for(var num = i; num<=j; num++){
        answer+=num;
    }

    return answer.split('').filter(x=> x.includes(k)).length;
}