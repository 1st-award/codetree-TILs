def solution(numbers):
    for a in range(1, 41):
        for b in range(a, 41):
            for c in range(b, 41):
                for d in range(c, 41):
                    arr2 = [a, b, c, d, a + b, b + c, c + d, d + a,
                    a + c, b + d, a + b + c, a + b + d, a + c + d, b + c + d,
                    a + b + c + d]
                    if numbers == sorted(arr2):
                        print(a, b, c, d)
                        return
                        


numbers = list(map(int, input().split()))
numbers.sort()
solution(numbers)