# x가 겹치는 좌표 제거
# y가 겹치는 좌표 제거
# 남은 좌표가 1개면 가능, 1개 초과면 물가능
def solution(N, point_list):
    x_list = []
    y_list = []
    for x, y in point_list:
        x_list.append(x)
        y_list.append(y)

    remove_idx_list = []
    for idx in range(N):
        if x_list.count(x) > 1 or y_list.count(y) > 1:
            remove_idx_list.append(idx)

    if len(point_list) - len(remove_idx_list) > 1 and len(point_list) > 3:
        return 0
    else:
        return 1

N = int(input())
point_list = [tuple(map(int, input().split())) for _ in range(N)]
print(solution(N, point_list))