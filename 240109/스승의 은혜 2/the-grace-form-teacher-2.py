def solution(N, B, prices):
    max_available = 0
    for i in range(N):
        temp_price = 0
        overflow_price = False
        for j in range(N):
            # print(j)
            temp_price += prices[j] // 2 if i == j else prices[j]
            if temp_price > B:
                overflow_price = True
                break
        if overflow_price:
            max_available = max(max_available, j)
        else:
            return len(prices)
    return max_available
                

N, B = map(int, input().split())
prices = [int(input()) for _ in range(N)]
print(solution(N, B, prices))