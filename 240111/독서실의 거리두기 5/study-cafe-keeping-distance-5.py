def calc_distance(N, seats):
    min_dist = N
    for i in range(N):
        for j in range(i + 1, N):
            if seats[i] == 1 and seats[j] == 1:
                min_dist = min(min_dist, j - i)
    return min_dist

def solution(N, seats):
    best_distance = 0
    for i in range(N):
        if seats[i] == 0:
            seats[i] = 1
            best_distance = max(best_distance, calc_distance(N, seats))
            seats[i] = 0
    return best_distance


N = int(input())
seats = list(map(int, list(input())))
print(solution(N, seats))