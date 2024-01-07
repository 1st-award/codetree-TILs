def solution(N, cp_list):
    distance_list = []
    for idx in range(N-2):
        distance = abs(cp_list[idx][0] - cp_list[idx+1][0]) + abs(cp_list[idx][1] - cp_list[idx+1][1])
        distance_list.append(distance)
    longest_distance_idx = distance_list.index(max(distance_list)) + 1
    del cp_list[longest_distance_idx]
    distance_list = []
    for idx in range(N-2):
        distance = abs(cp_list[idx][0] - cp_list[idx+1][0]) + abs(cp_list[idx][1] - cp_list[idx+1][1])
        distance_list.append(distance)
    return sum(distance_list)

N = int(input())
cp_list = [list(map(int, input().split())) for _ in range(N)]
print(solution(N, cp_list))