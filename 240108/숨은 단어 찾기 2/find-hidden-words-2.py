def solution(y, x, board):
    count = 0
    # 가로
    for yy in range(y):
        for xx in range(x - 2):
            search = board[yy][xx: xx+3]
            if ''.join(search) == "LEE" or ''.join(search) == "EEL":
                count += 1
    # 세로
    for yy in range(y - 2):
        for xx in range(x):
            search = [board[yy][xx], board[yy+1][xx], board[yy+2][xx]]
            if ''.join(search) == "LEE" or ''.join(search) == "EEL":
                count += 1
    # 대각선 \
    for yy in range(y - 2):
        for xx in range(x - 2):
            search = [board[yy][xx], board[yy+1][xx+1], board[yy+2][xx+2]]
            if ''.join(search) == "LEE" or ''.join(search) == "EEL":
                count += 1
    # 대각선 /
    for yy in range(y-1, 1, -1):
        for xx in range(x - 2):
            search = [board[yy][xx], board[yy-1][xx+1], board[yy-2][xx+2]]
            if ''.join(search) == "LEE" or ''.join(search) == "EEL":
                count += 1
    return count
y, x = map(int, input().split())
board = [list(input()) for _ in range(y)]
print(solution(y, x, board))