import sys

MAX_NUM = sys.maxsize
MIN_NUM = -sys.maxsize + 1
def solution(N, points):
    min_area = MAX_NUM
    for i in range(N):
        count_list = [0] * N
        temp_points = points.copy()
        del temp_points[i]
        min_x, min_y, max_x, max_y = MAX_NUM, MAX_NUM, MIN_NUM, MIN_NUM
        for x, y in temp_points:
            min_x = min(min_x, x)
            min_y = min(min_y, y)
            max_x = max(max_x, x)
            max_y = max(max_y, y)
        area = (max_x - min_x) * (max_y - min_y)
        min_area = min(min_area, area)
    return min_area            


N = int(input())
points = [list(map(int, input().split())) for _ in range(N)]
print(solution(N, points))