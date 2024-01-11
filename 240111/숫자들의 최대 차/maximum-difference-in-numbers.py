def solution(N, K, numbers):
    max_num = max(numbers)
    best_length = 0
    for i in range(1, max_num + 1):
        cnt = 0
        for num in numbers:
            if i <= num <= i + K:
                cnt += 1
        best_length = max(best_length, cnt)
    return best_length

   


N, K = map(int, input().split())
numbers = [int(input()) for _ in range(N)]
numbers.sort()
print(solution(N, K, numbers))