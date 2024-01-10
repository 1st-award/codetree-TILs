def solution(X, Y):
    count = 0
    for N in range(X, Y + 1):
        numbers = str(N)
        reverse_numbers = str(N)[::-1]
        if numbers == reverse_numbers:
            # print(numbers, reverse_numbers)
            count += 1
    return count


X, Y = map(int, input().split())
print(solution(X, Y))