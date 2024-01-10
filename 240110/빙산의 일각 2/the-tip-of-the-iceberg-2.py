# 해수면의 높이를 0 <= H < H(max)까지 올림
# 빙산의 개수를 계산, 최대값 비교 저장
# 빙산이 떨어져있는 경우 -> 빙산크기 - 해수면의 높이 <= 0이 나온경우
# 빙산 계산 -> 맨 끝에 더미 빙산(0)을 넣어,
# 전체 한 덩어리일지라도 더미데이터로 인해 계산되게끔 설계
def solution(N, iceberg_list):
    max_height = max(iceberg_list)
    max_iceberg_group = 0
    for h in range(max_height):
        iceberg_count = 0
        include_iceberg = False
        for iceberg_h in iceberg_list:
            if iceberg_h - h > 0:
                include_iceberg = True
            elif include_iceberg:
                include_iceberg = False
                iceberg_count += 1
        max_iceberg_group = max(max_iceberg_group, iceberg_count)
    return max_iceberg_group


N = int(input())
iceberg_list = [int(input()) for _ in range(N)]
iceberg_list.append(0)
print(solution(N, iceberg_list))