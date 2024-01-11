def solution(N, range_list):
    for n in range(1, range_list[-1][1]):
        temp = n
        is_pass = True
        for x, y in range_list:
            temp *= 2
            # print(x, y, temp)
            if x > temp or y < temp:
                # print("false")
                is_pass = False
                break
        if is_pass:
            return n
    return 0

N = int(input())
range_list = [tuple(map(int, input().split())) for _ in range(N)]
range_list.sort(key=lambda x: x[0])
print(solution(N, range_list))