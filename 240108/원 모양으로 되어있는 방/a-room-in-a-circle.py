import sys

def solution(N, persons):
    min_distance = MAX_NUM
    for start_room in range(N):
        target_room = start_room
        temp_distance = 0
        for i in range(1, N):
            temp_distance += persons[target_room] * i
            target_room += 1
            target_room %= N
        min_distance = min(min_distance, temp_distance)
    return min_distance

MAX_NUM = sys.maxsize
N = int(input())
persons = [int(input()) for _ in range(N)]
print(solution(N, persons))