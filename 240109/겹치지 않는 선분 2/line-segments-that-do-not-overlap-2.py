def solution(N, points):
    remove_target_idx_list = []
    for i in range(N):
        for j in range(i + 1, N):
            ax, ay = points[i]
            bx, by = points[j]
            if ax < bx and ay > by or\
            ax > bx and ay < by:
                remove_target_idx_list.append(i)
                remove_target_idx_list.append(j)

    # print(remove_target_idx_list)
    return len(points) - len(set(remove_target_idx_list))

N = int(input())
points = [tuple(map(int, input().split())) for _ in range(N)]
# print(points)
print(solution(N, points))