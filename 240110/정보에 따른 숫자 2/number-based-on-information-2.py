# 특정 위치 지정
# 특정 위치에서 가장 가까운 S과 N의 위치를 저장
# d1, d2의 위치를 계산하여 결과 저장
def solution(T, a, b, board):
    count = 0
    for target in range(a, b + 1):
        close_S_pos = 101
        close_N_pos = 101
        for pos in range(101):
            ch = board[pos]
            if ch == "S":
                close_S_pos = min(close_S_pos, abs(target - pos))
            elif ch == "N":
                # print(target, pos)
                close_N_pos = min(close_N_pos, abs(target - pos))

        if close_S_pos <= close_N_pos:
            count += 1
    return count



T, a, b = map(int, input().split())
board = [None] * 101
for ch, pos in list(input().split() for _ in range(T)):
    board[int(pos)] = ch
# print(board)
print(solution(T, a, b, board))