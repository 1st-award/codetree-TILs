# 2명이 팀 -> 두개의 숫자만 나와야하며, 개수는 1, 2 또는 2, 1만 허용
def solution(N, board):
    win_team_list = []
    for i in range(N):
        # 가로
        width = board[i]
        if len(set(width)) == 2:
            win_team_list.append(tuple(set(width)))
        # 세로
        height = [board[0][i], board[1][i], board[2][i]]
        if len(set(height)) == 2:
            win_team_list.append(tuple(set(height)))
    # 대각선 /
    line_b_t = [board[2][0], board[1][1], board[0][2]]
    if len(set(line_b_t)) == 2:
            win_team_list.append(tuple(set(line_b_t)))
    # 대각선 \
    line_t_b = [board[0][0], board[1][1], board[2][2]]
    if len(set(line_t_b)) == 2:
            win_team_list.append(tuple(set(line_t_b)))
    
    return len(set(win_team_list))


N = 3
board = [list(input()) for _ in range(N)]
print(solution(N, board))