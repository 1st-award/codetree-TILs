import sys
MAX_NUM = sys.maxsize

def solution(ablity_list):
    N = 6
    min_diff = MAX_NUM
    sum_ablity = sum(ablity_list)
    for x in range(N):
        for y in range(x+1, N):
            for z in range(y+1, N):
                group_1 = ablity_list[x] + ablity_list[y] + ablity_list[z]
                group_2 = sum_ablity - group_1
                diff = abs(group_1 - group_2)
                min_diff = min(min_diff, diff)
    return min_diff

ablity_list = list(map(int, input().split()))
print(solution(ablity_list))