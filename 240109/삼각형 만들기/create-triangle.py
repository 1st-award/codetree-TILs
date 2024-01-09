def solution(N, points):
    max_area = 0
    for a in range(N):
        for b in range(a + 1, N):
            for c in range(b + 1, N):
                ax, ay = points[a]
                bx, by = points[b]
                cx, cy = points[c]

                if len(set([ax, bx, cx])) == 3 or len(set([ay, by, cy])) == 3:
                    continue
                
                min_x = min(ax, bx, cx)
                max_x = max(ax, bx, cx)
                min_y = min(ay, by, cy)
                max_y = max(ay, by, cy)
                area = (max_x - min_x) * (max_y - min_y)
                max_area = max(max_area, area)
    return max_area


N = int(input())
points = [tuple(map(int, input().split())) for _ in range(N)]
print(solution(N, points))