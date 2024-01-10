# x, y의 최대값 구함
# 최대값이 홀수면 + 1하여 저장
# x, y 각각 나누기 2하여 분할
def solution(N, lines):
    mx, my = 0, 0
    for x, y in lines:
        mx = max(mx, x)
        my = max(my, y)
    mx = mx + 1 if mx % 2 == 1 else mx + 2
    my = my + 1 if my % 2 == 1 else my + 2
    board = [[0] * mx for _ in range(my)]
    for x, y in lines:
        board[y][x] = 1

    best_diff = 101
    best_point = 101
    for ly in range(my):
        for lx in range(mx):
            # 1 사분면 lx < px, ly < py
            quantum_1 = 0
            for ly1 in range(ly + 1, my):
                for lx1 in range(lx + 1, mx):
                    if board[ly1][lx1] == 1:
                        quantum_1 += 1
            # 2 사분면 lx > px, ly < py
            quantum_2 = 0
            for ly1 in range(ly + 1, my):
                for lx1 in range(lx):
                    if board[ly1][lx1] == 1:
                        quantum_2 += 1
            # 3 사분면 lx > px, ly > py
            quantum_3 = 0
            for ly1 in range(ly):
                for lx1 in range(lx):
                    if board[ly1][lx1] == 1:
                        quantum_3 += 1
            # 4 사분면 lx < px, ly > py
            quantum_4 = 0
            for ly1 in range(ly):
                for lx1 in range(lx + 1, mx):
                    if board[ly1][lx1] == 1:
                        quantum_4 += 1
            # print(quantum_1, quantum_2, quantum_3, quantum_4)
            # print (sum_quantum, len(lines))
            sum_quantum = quantum_1 + quantum_2 + quantum_3 + quantum_4
            if sum_quantum == len(lines):
                min_quantum = min(quantum_1, quantum_2, quantum_3, quantum_4)
                max_quantum = max(quantum_1, quantum_2, quantum_3, quantum_4)
                diff_quantum = max_quantum - min_quantum
                if best_diff >= diff_quantum:
                    best_diff = diff_quantum
                    best_point = max_quantum
    return best_point    


N = int(input())
lines = [tuple(map(int, input().split())) for _ in range(N)]
print(solution(N, lines))