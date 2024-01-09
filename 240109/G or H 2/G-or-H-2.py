def solution(N, sign):
    max_size = 0
    for start in range(101):
        for end in range(start+1, 101):
            if sign[start] == 0 or sign[end] == 0:
                continue

            search = sign[start : start + end]
            G_cnt = search.count("G")
            H_cnt = search.count("H")
            if G_cnt == 0 or H_cnt == 0 or G_cnt == H_cnt:
                max_size = max(max_size, end - start)

    return max_size


N = int(input())
sign = [0] * 101
for idx, ch in list(input().split() for _ in range(N)):
    sign[int(idx)] = ch
print(solution(N, sign))