def solution(N, M, numbers):
    best_score = 0
    for n in range(N):
        score = 0
        next_idx = n
        for _ in range(M):
            score += numbers[next_idx]
            next_idx = numbers[next_idx] - 1
        best_score = max(best_score, score)
    return best_score


N, M = map(int, input().split())
numbers = list(map(int, input().split()))
print(solution(N, M, numbers))