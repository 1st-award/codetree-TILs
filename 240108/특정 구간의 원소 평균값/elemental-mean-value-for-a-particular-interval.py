def solution(N, board):
    count = 0
    for i in range(N):
        for j in range(i, N):
            temp_board = [] 
            for k in range(i, j + 1):
                temp_board.append(board[k])
            # print(sum(temp_board) // len(temp_board), temp_board)
            if sum(temp_board) // len(temp_board) in temp_board and sum(temp_board) % len(temp_board) == 0:
                count += 1
    return count

N = int(input())
board = list(map(int, input().split()))
print(solution(N, board))