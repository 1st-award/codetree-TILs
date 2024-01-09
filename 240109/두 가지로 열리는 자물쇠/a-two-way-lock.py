def solution(N, comb_1, comb_2):
    count = 0
    for a in range(1, N+1):
        for b in range(1, N+1):
            for c in range(1, N+1):
                if abs(comb_1[0] - a) > 2:
                    diff_comb1_a =  abs((comb_1[0] + N) - a) if a > comb_1[0] else abs(comb_1[0] - (a + N))
                else :
                    diff_comb1_a = abs(comb_1[0] - a) 
                if abs(comb_1[1] - b) > 2:
                    diff_comb1_b =  abs((comb_1[1] + N) - b) if b > comb_1[1] else abs(comb_1[1] - (b + N))
                else :
                    diff_comb1_b = abs(comb_1[1] - b)
                if abs(comb_1[2] - c) > 2:
                    diff_comb1_c =  abs((comb_1[2] + N) - c) if c > comb_1[2] else abs(comb_1[2] - (c + N))
                else :
                    diff_comb1_c = abs(comb_1[2] - c) 

                if abs(comb_2[0] - a) > 2:
                    diff_comb2_a =  abs((comb_2[0] + N) - a) if a > comb_2[0] else abs(comb_2[0] - (a + N))
                else :
                    diff_comb2_a = abs(comb_2[0] - a) 
                if abs(comb_2[1] - b) > 2:
                    diff_comb2_b =  abs((comb_2[1] + N) - b) if b > comb_2[1] else abs(comb_2[1] - (b + N))
                else :
                    diff_comb2_b = abs(comb_2[1] - b)
                if abs(comb_2[2] - c) > 2:
                    diff_comb2_c =  abs((comb_2[2] + N) - c) if c > comb_2[2] else abs(comb_2[2] - (c + N))
                else :
                    diff_comb2_c = abs(comb_2[2] - c) 

                if diff_comb1_a < 3 and diff_comb1_b < 3 and diff_comb1_c < 3:
                    count += 1
                elif diff_comb2_a < 3 and diff_comb2_b < 3 and diff_comb2_c < 3:
                    count += 1
    return count

N = int(input())
comb_1 = list(map(int, input().split()))
comb_2 = list(map(int, input().split()))
print(solution(N, comb_1, comb_2))