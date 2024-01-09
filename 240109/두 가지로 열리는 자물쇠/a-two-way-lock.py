def solution(N, comb_1, comb_2):
    count = 0
    for a in range(1, N+1):
        for b in range(1, N+1):
            for c in range(1, N+1):
                diff_comb1_a =  abs(comb_1[0] - a + N) if abs(comb_1[0] - a) > 2 else abs(comb_1[0] - a)
                diff_comb1_b =  abs(comb_1[1] - b + N) if abs(comb_1[1] - b) > 2 else abs(comb_1[1] - b)
                diff_comb1_c =  abs(comb_1[2] - c + N) if abs(comb_1[2] - c) > 2 else abs(comb_1[2] - c)

                diff_comb2_a =  abs(comb_2[0] - a + N) if abs(comb_2[0] - a) > 2 else abs(comb_2[0] - a)
                diff_comb2_b =  abs(comb_2[1] - b + N) if abs(comb_2[1] - b) > 2 else abs(comb_2[1] - b)
                diff_comb2_c =  abs(comb_2[2] - c + N) if abs(comb_2[2] - c) > 2 else abs(comb_2[2] - c)
                
                if diff_comb1_a < 3 and diff_comb1_b < 3 and diff_comb1_c < 3 or\
                diff_comb2_a < 3 and diff_comb2_b < 3 and diff_comb2_c < 3:
                    count += 1
    return count

N = int(input())
comb_1 = list(map(int, input().split()))
comb_2 = list(map(int, input().split()))
print(solution(N, comb_1, comb_2))