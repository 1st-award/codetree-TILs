def solution(N, K, numbers):
    cnt = 0
    for i in range(N):
        temp_cnt = 0
        for j in range(N):
            if i == j:
                continue
            if abs(numbers[i] - numbers[j]) <= 3:
                temp_cnt += 1
        cnt = max(cnt, temp_cnt)
    return cnt


N, K = map(int, input().split())
numbers = [int(input()) for _ in range(N)]
print(solution(N, K, numbers))