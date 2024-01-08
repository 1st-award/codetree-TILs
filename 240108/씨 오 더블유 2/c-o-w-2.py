def solution(N, pattern):
    count = 0
    for i in range(N - 2):
        for j in range(i + 1, N - 1):
            for k in range(j + 1, N):
                cow = pattern[i] + pattern[j] + pattern[k]
                if cow == "COW":
                    count += 1
    return count

N = int(input())
pattern = list(input())
print(solution(N, pattern))