def solution(N, K, numbers):
    cnt = 0
    for x in list(set(numbers)):
        for y in list(set(numbers)):
            temp_list = []
            if y - x <= K:
                for n in numbers:
                    if x <= n <= y:
                        temp_list.append(n)
                cnt = max(cnt, len(temp_list))
    return cnt
   


N, K = map(int, input().split())
numbers = [int(input()) for _ in range(N)]
numbers.sort()
print(solution(N, K, numbers))