def solution(N, sign):
    max_size = 0
    for size in range(2, len(sign)//2):
        for idx in range(50 - size + 1):
            search = sign[idx : idx + size]
            G_cnt = search.count("G")
            H_cnt = search.count("H")
            if G_cnt == H_cnt:
                max_size = max(max_size, size)
                break
    return max_size


N = int(input())
sign = [None] * 100
for idx, ch in list(input().split() for _ in range(N)):
    sign[int(idx)] = ch
sign.reverse()
pos_H = sign.index("H")
pos_G = sign.index("G")
sign = sign[pos_G:] if pos_H > pos_G else sign[pos_H:]
sign.reverse()
# print(sign)
print(solution(N, sign))