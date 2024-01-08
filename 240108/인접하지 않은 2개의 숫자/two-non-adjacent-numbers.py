import sys

def solution(N, num_list):
    max_sum = MIN_NUM
    for s_idx in range(N - 2):
        for e_idx in range(s_idx + 2, N):
            temp_sum = num_list[s_idx] + num_list[e_idx]
            max_sum = max(max_sum, temp_sum)
    return max_sum

MIN_NUM = -sys.maxsize - 1
N = int(input())
num_list = list(map(int, input().split()))
print(solution(N, num_list))