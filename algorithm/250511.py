#[문제1] 다음과 같이 영어로 되어 있는 문자열이 있을 때, 이 문자열에서 반복되지 않는 첫번째 문자를 반환하시오. 
# 만약 그런 문자가 없다면 _ 를 반환하시오.

# input= "abadabac"

input = "abadabac"

def find_not_repeating_first_character(string):
    alphabet_occurrence_array = [0] * 26

    for char in string:
        if not char.isalpha():
            continue
        arr_index = ord(char) - ord("a")
        alphabet_occurrence_array[arr_index] += 1

    not_repeating_character_array = []
    for index in range(len(alphabet_occurrence_array)):
        alphabet_occurrence = alphabet_occurrence_array[index]

        if alphabet_occurrence == 1:
            not_repeating_character_array.append(chr(index + ord("a")))

    for char in string:
        if char in not_repeating_character_array:
            return char

    return "_"


result = find_not_repeating_first_character
print("정답 = d 현재 풀이 값 =", result("abadabac"))
print("정답 = c 현재 풀이 값 =", result("aabbcddd"))
print("정답 =_ 현재 풀이 값 =", result("aaaaaaaa"))


#-------------------------------------------------------------------
'''
자바스크립트로 작성해 본 알고리즘
function solution1(str){
    let unqArr = [...new Set(str.split(""))];
    let strLen = str.length;

    for(let i of unqArr){
        let len = str.replaceAll(i, '').length;
        if(strLen - len <= 1) return i; 
    }
}
'''
#-------------------------------------------------------------------
