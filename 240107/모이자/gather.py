import sys
def solution(n, houses):
    min_distance = MAX_INT
    for target_house in range(n):
        sum_distance = 0
        for idx in range(n):
            sum_distance += abs(target_house - idx) * houses[idx]
        min_distance = min(min_distance, sum_distance)
    return min_distance

MAX_INT = sys.maxsize
n = int(input())
houses = list(map(int, input().split()))
print(solution(n, houses))