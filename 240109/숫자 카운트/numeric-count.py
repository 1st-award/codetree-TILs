def solution(N, numbers):
    count = 0
    for a in range(1, 10):
        for b in range(1, 10):
            for c in range(1, 10):
                if a == b or a == c or b == c:
                    continue
                temp_numbers = [a, b, c]
                all_satisfaction = True
                for num, condition1, condition2 in numbers:
                    con_1_cnt = 0
                    con_2_cnt = 0
                    for i in range(3):
                        for j in range(3):
                            if num[i] == temp_numbers[j]:
                                if i == j:
                                    con_1_cnt += 1
                                else:
                                    con_2_cnt += 1
                    if con_1_cnt != condition1 or con_2_cnt != condition2:
                        all_satisfaction = False

                if all_satisfaction:
                    count += 1
    return count


N = int(input())
numbers = []
for _ in range(N):
    nums, ac, bc = input().split()
    numbers.append([list(map(int, nums)), int(ac), int(bc)])
print(solution(N, numbers))