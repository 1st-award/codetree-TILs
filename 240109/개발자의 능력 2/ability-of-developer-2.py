import sys

MAX_NUM = sys.maxsize
def solution(ablity_list):
    N = 6
    min_diff_group = MAX_NUM
    sum_ablity_list = sum(ablity_list)
    for i in range(N):
        for j in range(N):
            for x in range(N):
                for y in range(N):
                    if i == j or i == x or i == y or j == x or j == y or x == y:
                        continue
                    
                    group1 = ablity_list[i] + ablity_list[j]
                    group2 = ablity_list[x] + ablity_list[y]
                    group3 = sum_ablity_list - (group1 + group2)

                    max_ablity = max(group1, group2, group3)
                    min_ablity = min(group1, group2, group3)
                    # print(group1, group2, group3, max_ablity, min_ablity)
                    min_diff_group = min(min_diff_group, max_ablity - min_ablity)
    return min_diff_group
                

ablity_list = list(map(int, input().split()))
print(solution(ablity_list))