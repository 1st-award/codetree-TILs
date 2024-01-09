def solution(N, T, H, field):
    min_try = 999999
    for start in range(N):
        for end in range(start+T, N+1):
            # print(field[start:end])
            temp_try = 0
            for f in field[start:end]:
                temp_try += abs(f - H)
            min_try = min(min_try, temp_try)
    return min_try

N, H, T = map(int, input().split())
field = list(map(int, input().split()))
print(solution(N, T, H, field))