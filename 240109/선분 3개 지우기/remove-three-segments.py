# 임의의 선분 3개 지정
# 남은 선분을 count하여 모두 1이면 겹치지 않는것으로 평가
def solution(N, lines):
    count = 0
    for x in range(N):
        for y in range(x + 1, N):
            for z in  range(y + 1, N):
                check_dup = [0] * 101
                for i in range(len(lines)):
                    if i in [x, y, z]:
                        continue
                    start, end = lines[i]
                    for n in range(start, end + 1):
                        check_dup[n] += 1
                check_dup = list(set(check_dup))
                if len(check_dup) == 2 and 0 in check_dup and 1 in check_dup:
                    # print(check_dup)
                    count += 1
    return count


N = int(input())
lines = [list(map(int, input().split())) for _ in range(N)]
print(solution(N, lines))