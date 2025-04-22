# 시간 복잡도 
# 입력 값에 비해 얼마나 일을 수행해야 하는가 -> 각 줄이 실행되는 것을 1번의 연산이 된다고 생각
# 대부분의 알고리즘의 성능이 시간에 의해 결정되어 지는 경우가 많다.

def find_max_num(array):
    for number in array:                 # array 의 길이만큼 아래 연산이 실행
        for compare_number in array:     # array 의 길이만큼 아래 연산이 실행
            if number < compare_number:  # 비교 연산 1번 실행
                is_max_num = False       # 대입 연산 1번 실행
        if is_max_num:                   # 비교 연산 1번 실행
            return number


# 공간 복잡도
# 공간을 얼마나 차지하는가 -> 저장하는 데이터 1개당 1개의 공간을 사용한다.
# 공간복잡도가 동일한 경우 시간 복잡도로 비교, 대부분 알고리즘의 성능이 공간에 의해 결정되지는 않는다.
