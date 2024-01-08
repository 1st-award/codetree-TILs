def solution(N, board):
    max_coin = 0
    for i in range(N - 1):
        for j in range(N - 2):
            a_search = board[i][j:j+3]
            for y in range(i + 1, N):
                for x in range(N - 2):
                    b_search = board[y][x:x+3]
                    sum_a_b = a_search.count(1) + b_search.count(1)
                    max_coin = max(max_coin, sum_a_b)
    if N > 6:
        for i in range(N - 5):
            a_search = board[-1][i:i+3]
            b_search = board[-1][i+3: i+6]
            sum_a_b = a_search.count(1) + b_search.count(1)
            max_coin = max(max_coin, sum_a_b)
    return max_coin

N = int(input())
board = [list(map(int, input().split())) for _ in range(N)]
print(solution(N, board))