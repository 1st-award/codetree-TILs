def solution(N, board):
    max_coin = -1
    for i in range(N):
        for j in range(N-2):
            zoom_board = board[i][j:j+3]
            max_coin = max(max_coin, zoom_board.count(1))
    return max_coin

N = int(input())
board = []
for _ in range(N):
    board.append(list(map(int, input().split())))
print(solution(N, board))