import sys

def solution(N, cp_list):
    min_disatnce = MAX_NUM
    for skip_cp in range(1, N-1):
        temp_distance = 0
        temp_cp_list = cp_list.copy()
        del temp_cp_list[skip_cp]
        for cp_idx in range(N - 2):
            temp_distance += abs(temp_cp_list[cp_idx][0] - temp_cp_list[cp_idx+1][0]) + abs(temp_cp_list[cp_idx][1] - temp_cp_list[cp_idx+1][1])
        min_disatnce = min(temp_distance, min_disatnce)
    return min_disatnce

MAX_NUM = sys.maxsize
N = int(input())
cp_list = [list(map(int, input().split())) for _ in range(N)]
print(solution(N, cp_list))