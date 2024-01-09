def solution(N, hours):
    max_run_time = 0
    for i in range(N):
        min_start = 1001
        max_end = 0
        time_card = [0] * 1001
        for j in range(N):
            if i == j:
                continue
            start, end = hours[j]
            for time in range(start, end):
                time_card[time] += 1
        max_run_time = max(max_run_time, 1001- time_card.count(0))
    return max_run_time

    
N = int(input())
hours = [tuple(map(int, input().split())) for _ in range(N)]
print(solution(N, hours))