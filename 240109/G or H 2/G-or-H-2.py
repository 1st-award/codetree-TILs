def solution(N, sign):
    max_size = 0
    max_socre = 0
    for size in range(2, len(sign)):
        for idx in range(len(sign) - size + 1):
            search = sign[idx : idx + size]
            G_cnt = search.count("G")
            H_cnt = search.count("H")
            if G_cnt > 1 and H_cnt == 0 or\
            G_cnt == 0 and H_cnt > 1 or\
            G_cnt == H_cnt and G_cnt != 0 and H_cnt != 0 and\
            max_socre < G_cnt + H_cnt:
                # print(max_socre, G_cnt + H_cnt)
                max_size = max(max_size, size-1)
                max_socre = max(max_socre, G_cnt + H_cnt)
    return max_size


N = int(input())
sign = [None] * 100
for idx, ch in list(input().split() for _ in range(N)):
    sign[int(idx)] = ch
sign.reverse()
if sign.count("H") != 0 and sign.count("G") != 0:
    pos_H = sign.index("H")
    pos_G = sign.index("G")
    sign = sign[pos_G:] if pos_H > pos_G else sign[pos_H:]
    # print(sign)
sign.reverse()
print(solution(N, sign))