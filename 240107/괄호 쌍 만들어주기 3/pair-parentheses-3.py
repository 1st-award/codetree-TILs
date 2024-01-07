def solution(A_string):
    length_A = len(A_string)
    count = 0
    for i in range(length_A):
        if A_string[i] != "(":
            continue
        for j in range(i+1, length_A):
            if A_string[j] == ")":
                count += 1
    return count

A_string = input()
print(solution(A_string))