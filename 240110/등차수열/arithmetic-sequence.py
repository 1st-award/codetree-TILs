# i, j위치에 있는 숫자 지정
# i < n < j 범위로 순회하며 등차수열에 만족하는지 계산
# 최대 등차수열 개수 return
def solution(N, numbers):
    numbers.sort()
    max_count = 0
    sequence_k_list = []
    for i in range(N):
        for j in range(i + 1, N):
            for k in range(numbers[i] + 1, numbers[j]):
                if abs(numbers[i] - k) == abs(k - numbers[j]):
                    sequence_k_list.append(k)
    for n in list(set(sequence_k_list)):
        max_count = max(max_count, sequence_k_list.count(n))
    return max_count


N = int(input())
numbers = list(map(int, input().split()))
print(solution(N, numbers))