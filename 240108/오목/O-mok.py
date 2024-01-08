def soltuion(board):
    N = 19
    # 가로
    for y in range(N):
        for x in range(N - 5):
            search = board[y][x: x + 5]
            if search.count(1) == 5:
                return 1, y + 1, x + 3
            if search.count(2) == 5:
                return 2, y + 1, x + 3
    # 세로
    for y in range(N - 5):
        for x in range(N):
            search = [board[y][x], board[y+1][x], board[y+2][x], board[y+3][x], board[y+4][x]]
            if search.count(1) == 5:
                return 1, y + 3, x + 1
            if search.count(2) == 5:
                return 2, y + 3, x + 1
    # 대각선 \
    for y in range(N - 5):
        for x in range(N - 4):
            search = [board[y][x], board[y+1][x+1], board[y+2][x+2], board[y+3][x+3], board[y+4][x+4]]
            if search.count(1) == 5:
                return 1, y + 3, x + 3
            if search.count(2) == 5:
                return 2, y + 3, x + 3
    # 대각선 /
    for y in range(N, 3, -1):
        for x in range(N - 4):
            search = [board[y][x], board[y-1][x+1],board[y-2][x+2], board[y-3][x+3], board[y-4][x+4]]
            if search.count(1) == 5:
                return 1, y - 2, x + 3
            if search.count(2) == 5:
                return 2, y - 2, x + 3

board = [list(map(int, input().split())) for _ in range(19)]
win, y, x = soltuion(board)
print(win)
if win != 0:
    print(y, x)