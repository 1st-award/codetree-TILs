def solution(N, K, sign_log):
    board = []
    max_score = 0
    max_distance = 0
    sign_log.sort(key=lambda x: int(x[0]))
    for distance, _ in sign_log:
        max_distance = max(max_distance, int(distance))

    pos = 1
    while pos < max_distance:
        sign = sign_log[0]
        del sign_log[0]
        diff_distance = abs(pos - int(sign[0]))
        # print(sign, diff_distance)
        if diff_distance != 0:
            for _ in range(diff_distance):
                board.append(None)    
        board.append(sign[1])
        pos += diff_distance + 1
    for idx in range(max_distance - K):
        search = board[idx: idx+K+1]
        count_G = search.count("G")
        count_H = search.count("H")
        temp_sum = count_G + count_H * 2
        # print(search, temp_sum)
        max_score = max(max_score, temp_sum)
    return max_score
N, K = map(int, input().split())
sign_log = [list(input().split()) for _ in range(N)]
print(solution(N, K, sign_log))