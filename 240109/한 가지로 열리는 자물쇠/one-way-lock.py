def solution(N, a, b, c):
    count = 0
    for x in range(1, N+1):
        for y in range(1, N+1):
            for z in range(1, N+1):
                diff_a = abs(a - x)
                diff_b = abs(b - y)
                diff_c = abs(c - z)
                if diff_a <= 2 or diff_b <= 2 or diff_c <= 2:
                    count += 1
    return count
    
N = int(input())
a, b, c = map(int, input().split())
print(solution(N, a, b, c))