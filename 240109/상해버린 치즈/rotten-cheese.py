def solution(N, M, D, S, eat_log, hit_log):
    # 해당 치즈를 먹어 가장 늦게 반응온 사람 시간 기준으로 먹은 기록 긁어오기
    # 아픈기록 찾아서 해당 시간 밑으로 아픈 기록 싹 긁어오기
    # 아픈사람들의 공통 치즈 종류 찾기
    # 먹은 기록 길이를 최대 먹은 기록 길이와 비교하여 저장하기

    # 현재 문제 -> 치즈를 먹엇지만 배가 아픈사람 모두가 먹지 않았음
    # 해결방법 -> 상한치즈라고 추즉되는 치즈를 확정적으로 배가 아픈사람이 먹엇는지 확인하기
    max_predict = 0
    hit_p_list = []
    predict_bad_cheeses = []
    latest_hit_t = hit_log[0][1]
    for hit_p, hit_t in hit_log:
        hit_p_list.append(hit_p)
        for eat_p, eat_m, eat_t in eat_log:
            if hit_p == eat_p and hit_t > eat_t:
                predict_bad_cheeses.append(eat_m)
    
    predict_bad_cheeses = list(set(predict_bad_cheeses))
    # print(predict_bad_cheeses)
    for bad_cheese in predict_bad_cheeses:
        temp_eat_p_list = []
        all_eat_cheese = True
        for eat_p, eat_m, eat_t in eat_log:
            if eat_m == bad_cheese and eat_t < latest_hit_t:
                temp_eat_p_list.append(eat_p)
        for eat_p in hit_p_list:
            if eat_p not in temp_eat_p_list:
                all_eat_cheese = False
                break
        if all_eat_cheese:
            # print(bad_cheese, hit_p_list, temp_eat_p_list)
            max_predict = max(max_predict, len(temp_eat_p_list))
    return max_predict


N, M, D, S = map(int, input().split())
eat_log = [tuple(map(int, input().split())) for _ in range(D)]
hit_log = [tuple(map(int, input().split())) for _ in range(S)]
hit_log.sort(key=lambda x: x[-1], reverse=True)
# print(hit_log)
print(solution(N, M, D, S, eat_log, hit_log))