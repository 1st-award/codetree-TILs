def solution(n, cows):
    count = 0
    for x in range(n):
        for y in range(x+1, n):
            for z in range(y+1, n):
                if cows[x] <= cows[y] <= cows[z]:
                    count += 1
    return count

n = int(input())
cows = list(map(int, input().split()))
print(solution(n, cows))