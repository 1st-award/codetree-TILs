import sys

MAX_NUM = sys.maxsize
def solution(N, points):
    min_distance = MAX_NUM
    for i in range(N):
        for j in range(N):
            if i == j:
                continue
            ax, ay = points[i]
            bx, by = points[j]
            distance = abs(ax - bx) ** 2 + abs(ay - by) ** 2
            min_distance = min(min_distance, distance)
    return min_distance


N = int(input())
points = [tuple(map(int, input().split())) for _ in range(N)]
print(solution(N, points))