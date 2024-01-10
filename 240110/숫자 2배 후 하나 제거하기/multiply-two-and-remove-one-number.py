import sys
# 0 <= i < N을 순회하며 해당 숫자 2배
# 0 <= j < N을 순회하며 해당 숫자 제거
# 0 <= k < N-1을 순회하며 인접한 숫자간의 차이 계산
# 가장 차이가 작은 합을 return
MAX_NUM = sys.maxsize
def solution(N, numbers):
    min_diff = MAX_NUM
    for i in range(N):
        numbers[i] *= 2
        for j in range(N):
            if i == j:
                break
            temp_numbers = [numbers[n] for n in range(N) if j != n]
            diff_count = 0
            for k in range(N - 2):
                diff_count += abs(temp_numbers[k] - temp_numbers[k+1])
            min_diff = min(min_diff, diff_count)
        numbers[i] //= 2
    return min_diff


N = int(input())
numbers = list(map(int, input().split()))
print(solution(N, numbers))