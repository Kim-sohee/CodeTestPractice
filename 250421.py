# [연습1] 최댓값 찾기
# Q: 다음과 같이 숫자로 이루어진 배열이 있을 때, 이 배열 내에서 가장 큰 수를 반환하시오.
# [3, 5, 6, 1, 2, 4, 3, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 43, 5, 6, 1, 2, 4]

# 첫 번째 방법
# 각 숫자마다 모든 다른 숫자와 비교해서 최대값인지 확인, 만약 다른 모든 값보다 크다면 반복문을 중단
def find_max_num1(array):
    for number in array:
        is_max_num = True
        for compare_number in array:
            if number < compare_number:
                is_max_num = False
        if is_max_num:
            return number

print("정답 = 6 / 현재 풀이 값 = ", find_max_num1([3, 5, 6, 1, 2, 4]))
print("정답 = 6 / 현재 풀이 값 = ", find_max_num1([6, 6, 6]))
print("정답 = 1888 / 현재 풀이 값 = ", find_max_num1([6, 9, 2, 7, 1888]))

# 두 번째 방법
# 가장 큰 수를 저장할 변수를 만들고, 배열을 돌아가면서 그 변수와 비교
def find_max_num2(array):
    max_num = array[0]
    for num in array:
        if num > max_num:
            max_num = num
    return max_num


print("정답 = 6 / 현재 풀이 값 = ", find_max_num2([3, 5, 6, 1, 2, 4]))
print("정답 = 6 / 현재 풀이 값 = ", find_max_num2([6, 6, 6]))
print("정답 = 1888 / 현재 풀이 값 = ", find_max_num2([6, 9, 2, 7, 1888]))

# [연습2] 최빈값 찾기
# Q. 다음과 같은 문자열을 입력받았을 때, 어떤 알파벳이 가장 많이 포함되어 있는지 반환하시오.
# (단 최빈값을 가진 알파벳이 여러개일 경우 알파벳 순서가 가장 앞에 위치한 알파벳을 출력하시오)

# 첫 번째 방법
# 각 알파벳마다 문자열을 돌면서 몇 글자 나왔는지 확인, 만약 그 숫자가 저장한 알파벳 빈도 수보다 크다면, 그 값을 저장하고 제일 큰 알파벳으로 저장
def find_max_occurred_alphabet1(string):
    alphabet_array = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                      "t", "u", "v", "x", "y", "z"]
    max_occurrence = 0
    max_alphabet = alphabet_array[0]

    for alphabet in alphabet_array:
        occurrence = 0
        for char in string:
            if char == alphabet:
                occurrence += 1

        if occurrence > max_occurrence:
            max_alphabet = alphabet
            max_occurrence = occurrence

    return max_alphabet

print("정답 = i 현재 풀이 값 =", find_max_occurred_alphabet1("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", find_max_occurred_alphabet1("we love algorithm"))
print("정답 = b 현재 풀이 값 =", find_max_occurred_alphabet1("best of best youtube"))


# 두 번째 방법
# 각 알파벳의 빈도수를 alphabet_occurrence_list 라는 변수에 저장, 알파벳을 인덱스 화 시켜 각 알파벳의 빈도수를 업데이트
def find_max_occurred_alphabet2(string):
    alphabet_occurrence_array = [0] * 26

    for char in string:
        if not char.isalpha():
            continue
        arr_index = ord(char) - ord('a')
        alphabet_occurrence_array[arr_index] += 1

    max_occurrence = 0
    max_alphabet_index = 0
    for index in range(len(alphabet_occurrence_array)):
        alphabet_occurrence = alphabet_occurrence_array[index]
        if alphabet_occurrence > max_occurrence:
            max_occurrence = alphabet_occurrence
            max_alphabet_index = index

    return chr(max_alphabet_index + ord('a'))


result = find_max_occurred_alphabet2
print("정답 = i 현재 풀이 값 =", result("hello my name is dingcodingco"))
print("정답 = e 현재 풀이 값 =", result("we love algorithm"))
print("정답 = b 현재 풀이 값 =", result("best of best youtube"))