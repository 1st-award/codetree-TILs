# 특정 폭탄 번호 지정
# 특정 폭탄 번호를 기준으로 K 범위만큼 리스트 자르기
# count로 특정 폭탄 번호 갯수 확인하여 2개 이상이면 max_bomb_no에 저장
def solution(N, K, bomb_list):
    max_bomb_no = -1
    if len(bomb_list) == K:
        for bomb in list(set(bomb_list)):
            if bomb_list.count(bomb) > 1:
                max_bomb_no = max(max_bomb_no, bomb)
        return max_bomb_no

    for pos in range(len(bomb_list) - K):
        bombs = bomb_list[pos: pos + K + 1]
        # print(bombs)
        for bomb in list(set(bombs)):
            if bombs.count(bomb) > 1:
                max_bomb_no = max(max_bomb_no, bomb)
    
    return max_bomb_no
        

N, K = map(int, input().split())
bomb_list = [int(input()) for _ in range(N)]
print(solution(N, K ,bomb_list))