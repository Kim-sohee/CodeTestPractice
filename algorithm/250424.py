# 점근표기법
# 어떤 함수의 증가 양상을 다른 함수와의 비교로 표현하는 수론과 해석학의 방법이다.

# 종류는 빅오(Big-O) 표기법과 빅오메(Big-Ω)가 표기법이 있다.
# Big-O : 최악의 성능이 나올 때 어느정도 연산량이 걸릴 것인가?
# Big-Ω : 최고의 성능이 나올 때 어느정도 연산량이 걸릴 것인가?

# [문제] 배열에서 특정 숫자가 존재한다면 True, 존재하지 않다면 False를 반환
# [해결방법] 배열을 돌면서 배열의 원소가 찾고자 하는 숫자와 같은지 비교
def is_number_exist(number, array):
    for element in array:       #array의 길이만큼 아래 연산이 실행
        if number == element:   #비교 연산 1번 실행
            return True
    return False


result = is_number_exist
print("정답 = True 현재 풀이 값 =", result(3,[3,5,6,1,2,4]))
print("정답 = Flase 현재 풀이 값 =", result(7,[6,6,6]))
print("정답 = True 현재 풀이 값 =", result(2,[6,9,2,7,1888]))

#위의 문제에서 입력 값에 따라 연산량이 달라진다. (좋을때=1, 안 좋을때=N)
