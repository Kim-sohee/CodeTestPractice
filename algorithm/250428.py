#[문제1] 0혹은 양의 정수로만 이루어진 배열이 있을 때, 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며
# 숫자 사이에 'X' 혹은 '+' 연산자를 넣어 결과적으로 가장 큰 수를 구하는 프로그램을 작성하시오.
# 단, '+'보다 'X'를 먼저 계산하는 일반식과는 달리 모든 연산은 왼쪽에서 순서대로 이루어진다.

# input = [0, 3, 5, 6, 1, 2, 4]

def find_max_plus_or_multiply(array):
    plus_or_multiply_sum = 0
    for number in array:
        if number <= 1 or plus_or_multiply_sum <= 1:
            plus_or_multiply_sum += number
        else:
            plus_or_multiply_sum *= number
    return plus_or_multiply_sum


result = find_max_plus_or_multiply
print("정답 = 728 현재 풀이 값 =", result([0,3,5,6,1,2,4]))
print("정답 = 8820 현재 풀이 값 =", result([3,2,1,5,9,7,4]))
print("정답 = 270 현재 풀이 값 =", result([1,1,1,3,3,2,5]))

#[해결방법] 가장 큰 수를 반환하는 것이므로 항상 곱하기를 하면 되는것 아닌가? 
# -> No! 왜냐면 1혹은 0 같은 경우는 곱하는 것보다 더하는 것이 더 좋기 때문
# -> 합계와 현재 숫자가 1보다 작거나 같다면 더하고 그 외에는 전부 곱하면 가장 큰 수를 얻을 수 있음
# 참고: 위의 코드의 시간복잡도는 O(N)이다.

