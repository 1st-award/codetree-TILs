def solution(A, B, C):
    max_num = 0
    for x in range(C // A + 1):
        for y in range(C // B + 1):
            num = A * x + B * y
            if num <= C:
                max_num = max(max_num, num)
    return max_num
            

A, B, C = map(int, input().split())
print(solution(A, B, C))