import sys

def solution(N, target, numbers):
    samll_diff = MAX_NUM
    for i in range(N-1):
        for j in range(i+1, N):
            temp_numbers = numbers.copy()
            a, b = numbers[i], numbers[j]
            temp_numbers.remove(a)
            temp_numbers.remove(b)
            diff = abs(target - sum(temp_numbers))
            samll_diff = min(samll_diff, diff)
    return samll_diff

MAX_NUM = sys.maxsize
N, target = map(int, input().split())
numbers = list(map(int, input().split()))
print(solution(N, target, numbers))