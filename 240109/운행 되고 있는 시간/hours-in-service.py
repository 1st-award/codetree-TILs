def solution(N, hours):
    max_run_time = 0
    for i in range(N):
        min_start = 1001
        max_end = 0
        for j in range(N):
            if i == j:
                continue
            start, end = hours[j]
            min_start = min(min_start, start)
            max_end = max(max_end, end)
        max_run_time = max(max_run_time, max_end - min_start - 1)
    return max_run_time

    
N = int(input())
hours = [tuple(map(int, input().split())) for _ in range(N)]
print(solution(N, hours))