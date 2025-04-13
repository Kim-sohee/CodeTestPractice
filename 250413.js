// 음양 더하기 (lv.1)
// 어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
const absolutes = [4,7,12];
const signs = [true,false,true];
// console.log(solution1(absolutes, signs));

function solution1(absolutes, signs){
    var answer = 0;
    for(var i=0; i<absolutes.length; i++){
        signs[i]? answer += absolutes[i]: answer -= absolutes[i];
    }
    return answer;
}

// 없는 숫자 더하기 (lv.1)
// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
const numbers = [1,2,3,4,6,7,8,0];
// console.log(solution2(numbers));

function solution2(numbers){
    var answer = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
    return answer.filter(x=> !numbers.includes(x)).reduce((a,b)=>{return a+b},0);
}

// 나누어 떨어지는 숫자 배열 (lv.1)
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요. divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
const arr = [2, 36, 1, 3];
const divisor = 1;
// console.log(solution3(arr, divisor));

function solution3(arr, divisor){
    var answer = arr.filter(x=> x% divisor === 0);
    return answer.length > 0 ? answer.sort((a,b)=> a-b) : [-1];
}

// 콜라츠 추측 (lv.1)
// 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다.
/**1-1. 입력된 수가 짝수라면 2로 나눕니다. 
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.  */
// 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
const n = 626331;
// console.log(solution4(n));

function solution4(n){
    var count = 0;
    while(count < 500){
        if(n!==1){
            n%2===0 ? n=n/2: n=n*3+1;
            count++;
        }else{
            break;
        }
    }
    return count===500? -1: count;
}

// K번째 수 (lv.1)
// 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
const array = [1, 5, 2, 6, 3, 7, 4];
const commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]];
console.log(solution5(array, commands));

function solution5(array, commands){
    var answer = [];

    commands.forEach(element => {
        var first = array.slice(element[0]-1, element[1]).sort((a,b)=> a-b);
        answer.push(first[element[2]-1]);
    });

    return answer;
}