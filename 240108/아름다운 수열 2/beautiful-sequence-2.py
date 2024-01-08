def solution(N, M, A, B):
    count = 0
    for i in range(N - M + 1):
        skip = False
        search = A[i: i+M]
        for ch in set(B):
            if search.count(ch) == 0:
                skip = True
                break
        if not skip:
            count += 1
    return count


N, M = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
print(solution(N, M, A, B))