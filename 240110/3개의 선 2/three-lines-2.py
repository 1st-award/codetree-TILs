# 
def solution(N, point_list):
    xs, xm = 0, 0
    ys, ym = 0, 0
    for x, y in point_list:
        xs = min(xs, x + 1)
        xm = max(xm, x + 1)
        ys = min(ys, y + 1)
        ym = max(ym, y + 1)
    
    max_board = max(xm, ym)
    board = [[0] * max_board for _ in range(max_board)]
    for x, y in point_list:
        board[y][x] = 1
    
    count = 0
    for n in range(xs, ym):
        x_line_points = board[n]
        y_line_points = []
        for b in board:
            y_line_points.append(b[n])
        if x_line_points.count(1) > 1 or y_line_points.count(1) > 1:
            count += 1

    if count > 3:
        return 0
    else:
        return 1
    
    

N = int(input())
point_list = [tuple(map(int, input().split())) for _ in range(N)]
print(solution(N, point_list))