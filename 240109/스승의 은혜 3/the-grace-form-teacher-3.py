from copy import deepcopy

def solution(N, B, gift_list):
    # 선물 한개를 지정
    # 지정된 선물 가격을 반값으로 계산
    # 예산을 넘지 않는 선에서 가장 많이 선물할 수 있는 경우의 수 구하기
    max_p_cnt = 0
    for i in range(N):
        temp_total_price = 0
        all_available = True
        temp_gift_list = deepcopy(gift_list)
        temp_gift_list[i][0] //= 2
        temp_gift_list.sort(key=lambda x: (sum(x)))
        for j in range(N):
            price, ship = temp_gift_list[j]
            temp_total_price += price + ship
            if temp_total_price > B:
                all_available = False
                break

        if all_available:
            return len(gift_list)
        else:
            # if j == 6:
            #     print(temp_gift_list[:j])
            max_p_cnt = max(max_p_cnt, j)
    return max_p_cnt


N, B = map(int, input().split())
gift_list = [list(map(int, input().split())) for _ in range(N)]
# gift_list.sort(key=lambda x:sum(x))
# print(gift_list)
# print(gift_list)
print(solution(N, B, gift_list))