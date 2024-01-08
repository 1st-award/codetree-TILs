def solution(N, K, numbers):
    max_sum = 0
    for idx in range(N-K+1):
        search = numbers[idx: idx+K]
        max_sum = max(max_sum, sum(search))
    return max_sum

N, K = map(int, input().split())
numbers = list(map(int, input().split()))
print(solution(N, K, numbers))