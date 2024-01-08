import sys

def solution(N, num_list):
    max_num = MIN_NUM
    for i in range(N - 2):
        for j in range(i + 1, N - 1):
            for k in range(j + 1, N):
                max_length = len(str(max(num_list[i], num_list[j], num_list[k])))
                carray = False
                a = num_list[i]
                b = num_list[j]
                c = num_list[k]
                for pos in range(max_length):
                    aa = a % 10
                    bb = b % 10 
                    cc = c % 10
                    a //= 10
                    b //= 10
                    c //= 10
                    temp_sum_len = len(str(aa + bb +cc))
                    if temp_sum_len == 2:
                        carray = True
                        break
                if not carray:
                    temp_sum = num_list[i] + num_list[j] + num_list[k]
                    max_num = max(max_num, temp_sum)
    return max_num


MIN_NUM = -sys.maxsize - 1
N = int(input())
num_list = [int(input()) for _ in range(N)]
print(solution(N, num_list))