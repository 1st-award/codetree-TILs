def solution(N, M, A, B):
    count = 0
    for i in range(N - M + 1):
        search = A[i: i+M]
        if set(search) == set(B):
            count += 1
    return count


N, M = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
print(solution(N, M, A, B))