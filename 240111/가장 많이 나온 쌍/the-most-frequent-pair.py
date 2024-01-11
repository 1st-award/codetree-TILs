def solution(N, M, lines):
    best_line_cnt = 0
    for x1, x2 in lines:
        cnt_line = lines.count((x1, x2)) + lines.count((x2, x1))
        # print(x1, x2, cnt_line)
        best_line_cnt = max(best_line_cnt, cnt_line)
    return best_line_cnt

N, M = map(int, input().split())
lines = [tuple(map(int, input().split())) for _ in range(M)]
print(solution(N, M, lines))