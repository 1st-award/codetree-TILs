def solution(X, Y):
    count = 0
    for n in range(X, Y+1):
        numbers = list(str(n))
        include_nums = list(set(numbers))
        if len(include_nums) != 2:
            continue

        if numbers.count(include_nums[0]) == 1 or numbers.count(include_nums[1]) == 1:
            count += 1
    return count 
        

X, Y = map(int, input().split())
print(solution(X, Y))