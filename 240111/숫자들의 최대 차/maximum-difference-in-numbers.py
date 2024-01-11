def solution(N, K, numbers):
    cnt = 0
    for n in list(set(numbers)):
        temp_list = []
        for num in numbers:
            if abs(n-num) <= K:
                temp_list.append(num)

        if max(temp_list) - min(temp_list) <= K:
            # print(n, temp_list)
            cnt = max(cnt, len(temp_list))
    return cnt
   


N, K = map(int, input().split())
numbers = [int(input()) for _ in range(N)]
numbers.sort()
print(solution(N, K, numbers))