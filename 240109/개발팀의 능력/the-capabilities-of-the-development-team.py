import sys

MAX_NUM = sys.maxsize
def solution(ablity_list):
    N = 5
    min_diff_group = MAX_NUM
    sum_ablity_list = sum(ablity_list)
    for i in range(N):
        for j in range(N):
            for x in range(N):
                for y in range(N):
                    if i == j or i == x or i == y or j ==x or j== y or x == y:
                        continue
                    
                    group1 = ablity_list[i] + ablity_list[j]
                    group2 = ablity_list[x] + ablity_list[y]
                    group3 = sum_ablity_list - (group1 + group2)
                    
                    if group1 == group2 or group1 == group3 or group2 == group3:
                        continue

                    min_ablity_group = min(group1, group2, group3)
                    max_ablity_group = max(group1, group2, group3)
                    min_diff_group = min(min_diff_group, max_ablity_group - min_ablity_group)                    
                    # print(max_ablity_group, min_ablity_group, min_diff_group)
    return min_diff_group


ablity_list = list(map(int, input().split()))
print(solution(ablity_list))