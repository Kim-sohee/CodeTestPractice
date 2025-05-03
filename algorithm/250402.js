// 1. [PCCP 기출문제] 1번/ 동영상 재생기 (lv.1)
/* 당신은 동영상 재생기를 만들고 있습니다. 당신의 동영상 재생기는 10초 전으로 이동, 10초 후로 이동, 오프닝 건너뛰기 3가지 기능을 지원합니다.
동영상의 길이를 나타내는 문자열 video_len, 기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos, 오프닝 시작 시각을 나타내는 문자열 op_start, 오프닝이 끝나는 시각을 나타내는 문자열 op_end, 사용자의 입력을 나타내는 1차원 문자열 배열 commands가 매개변수로 주어집니다. 이때 사용자의 입력이 모두 끝난 후 동영상의 위치를 "mm:ss" 형식으로 return 하도록 solution 함수를 완성해 주세요.*/
const video_len = "10:55";
const pos = "00:05";
const op_start = "00:15";
const op_end = "06:55";
const commands = ["prev", "next", "next"];
// console.log(solution1(video_len, pos, op_start, op_end, commands));

function solution1(video_len, pos, op_start, op_end, commands){
    var answer = '';
    var convertMinute = {
        video_len: getminute(video_len),
        pos: getminute(pos),
        op_start: getminute(op_start),
        op_end: getminute(op_end)
    }
 
    for(var i of commands){
        if(convertMinute.pos >= convertMinute.op_start && convertMinute.pos <= convertMinute.op_end){
            convertMinute.pos = convertMinute.op_end;
        }
        if(i == "next"){
            if(convertMinute.pos + 10 > convertMinute.video_len){
                convertMinute.pos = convertMinute.video_len;
            }else{
                convertMinute.pos += 10;
            }
        } else if(i == "prev"){
            if(convertMinute.pos-10 < 0){
                convertMinute.pos = 0;
            }else{
                convertMinute.pos -= 10;
            }
        }
    }
    if(convertMinute.pos >= convertMinute.op_start && convertMinute.pos <= convertMinute.op_end){
        convertMinute.pos = convertMinute.op_end;
    }
    answer = convertMinute.pos;
    return getStringTime(answer);
}
function getminute(str){
    var minute = str.split(":").map(x=>Number(x));
    return minute[0]*60 + minute[1];
}
function getStringTime(minute){
    const hour = Math.floor(minute/60);
    const min = minute % 60;
    return `${hour.toString().padStart(2, '0')}:${min.toString().padStart(2, '0')}`;
}

// 2. [PCCP 기출문제] 1번/ 붕대감기 (lv.1)
/**붕대 감기는 t초 동안 붕대를 감으면서 1초마다 x만큼의 체력을 회복합니다. t초 연속으로 붕대를 감는 데 성공한다면 y만큼의 체력을 추가로 회복합니다. 게임 캐릭터에는 최대 체력이 존재해 현재 체력이 최대 체력보다 커지는 것은 불가능합니다.
기술을 쓰는 도중 몬스터에게 공격을 당하면 기술이 취소되고, 공격을 당하는 순간에는 체력을 회복할 수 없습니다. 몬스터에게 공격당해 기술이 취소당하거나 기술이 끝나면 그 즉시 붕대 감기를 다시 사용하며, 연속 성공 시간이 0으로 초기화됩니다.
몬스터의 공격을 받으면 정해진 피해량만큼 현재 체력이 줄어듭니다. 이때, 현재 체력이 0 이하가 되면 캐릭터가 죽으며 더 이상 체력을 회복할 수 없습니다.
당신은 붕대감기 기술의 정보, 캐릭터가 가진 최대 체력과 몬스터의 공격 패턴이 주어질 때 캐릭터가 끝까지 생존할 수 있는지 궁금합니다.
붕대 감기 기술의 시전 시간, 1초당 회복량, 추가 회복량을 담은 1차원 정수 배열 bandage와 최대 체력을 의미하는 정수 health, 몬스터의 공격 시간과 피해량을 담은 2차원 정수 배열 attacks가 매개변수로 주어집니다. 모든 공격이 끝난 직후 남은 체력을 return 하도록 solution 함수를 완성해 주세요. 만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return 해주세요.*/
const bandage = [5, 1, 5];  //시전시간, 초당회복량, 추가회복량
const health = 30;
const attacks = [[2, 10], [9, 15], [10, 5], [11, 5]];   // 공격시간, 피해량
// console.log(solution2(bandage, health, attacks));

function solution2(bandage, health, attacks){
    const [maxSuccess, heal, bonus] = [... bandage];
    const maxHealth = health;
    let currentHealth = health;
    var success = 0;
    var attackIdx = 0;
    
    for(var i=0; i<=attacks[attacks.length-1][0]; i++){
        //attack
        if(attackIdx < attacks.length && attacks[attackIdx][0] === i){
            currentHealth -= attacks[attackIdx][1];
            success = 0;
            attackIdx++;
            // heal skip
            if(currentHealth <= 0) return -1;
            continue;
        }

        // heal
        if (currentHealth > 0) {
            success++;
            if (currentHealth < maxHealth) {
                if (success === maxSuccess) {
                    currentHealth += heal + bonus;
                    currentHealth = Math.min(currentHealth, maxHealth);
                    success = 0;
                } else if (success < maxSuccess) {
                    currentHealth += heal;
                    currentHealth = Math.min(currentHealth, maxHealth);
                }
            }
        }

        //death
        if(currentHealth <= 0) return -1;
    }
    return currentHealth;
}


// 3. 옹알이(1) (lv.0)
/**조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.*/
const babbling = ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"];
// console.log(solution3(babbling));

function solution3(babbling){
    const talks = ["aya", "ye", "woo", "ma"];

    for(let talk of talks){
        babbling = babbling.map(x=> x.replace(talk, " "));
    }
    return babbling.map(x=> x.trim()).filter(x=> x.length <= 0).length;
}

//4. 캐릭터 좌표 (lv.0)
/**게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다. 예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다. 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다. 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.*/
const keyinput = ["right", "right", "right", "right", "right", "left"];
const board = [9, 5];
// console.log(solution4(keyinput, board));

function solution4(keyinput, board){
    const xEnd = Math.floor(board[0] / 2);
    const yEnd = Math.floor(board[1] / 2);
    let currentLocation = [0, 0];
    
    const move = {
        up: [0, 1],
        down: [0, -1],
        left: [-1, 0],
        right: [1, 0]
    }

    keyinput.forEach(element => {
        currentLocation = [
            currentLocation[0] + move[element][0],
            currentLocation[1] + move[element][1]
        ];
    });

    currentLocation[0] = Math.max(-xEnd, Math.min(xEnd, currentLocation[0]));
    currentLocation[1] = Math.max(-yEnd, Math.min(yEnd, currentLocation[1]));
    return currentLocation;
}
