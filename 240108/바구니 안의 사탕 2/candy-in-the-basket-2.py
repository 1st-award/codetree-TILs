def solution(N, K, baskets):
    max_candy = 0
    for c in range(1000 - K + 1):
        for i in range(c + 4, 1000 -K - 4 + 1):
            max_candy = max(max_candy, sum(baskets[i - K:i + K + 1]))
    return max_candy
N, K = map(int, input().split())
baskets = [0] * 101
for candy, pos in list(map(int, input().split()) for _ in range(N)):
    baskets[pos] = candy
print(solution(N, K, baskets))