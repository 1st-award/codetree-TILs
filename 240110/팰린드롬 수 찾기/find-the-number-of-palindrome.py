def solution(X, Y):
    count = 0
    for N in range(X, Y + 1):
        numbers = list(str(N))
        reverse_numbers = sorted(list(str(N)), reverse=True)
        if numbers == reverse_numbers:
            count += 1
    return count


X, Y = map(int, input().split())
print(solution(X, Y))