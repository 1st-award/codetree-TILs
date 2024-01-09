def solution(start, end):
    max_numbers = 0
    for n in range(start, end+1):
        numbers = list(map(int, list(str(n))))
        max_numbers = max(max_numbers, sum(numbers))
    return max_numbers

start, end = map(int, input().split())
print(solution(start, end))