# i번 종이컵에 조약돌을 넣었다 가정
# 기록을 토대로 점수 계산
# 최대 점수 return
def solution(N, ya_rock_log):
    best_score = 0
    for i in range(1, 4):
        cups = [0] * 4
        cups[i] = 1
        score = 0
        for a, b, c in ya_rock_log:
            cups[a], cups[b] = cups[b], cups[a]
            if cups[c] == 1:
                score += 1
        best_score = max(best_score, score)
    return best_score

    
N = int(input())
ya_rock_log = [list(map(int, input().split())) for _ in range(N)]
print(solution(N, ya_rock_log))