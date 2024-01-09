def solution(N, B, prices):
    max_available = 0
    for i in range(N):
        temp_price = 0
        for j in range(N):
            # print(j)
            temp_price += prices[j] // 2 if i == j else prices[j]
            if temp_price > B:
                max_available = max(max_available, j)
                break
    return max_available
                

N, B = map(int, input().split())
prices = [int(input()) for _ in range(N)]
print(solution(N, B, prices))