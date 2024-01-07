def solution(num_str):
    bin_pos = 1
    bin_sum = 0
    if num_str.count("0") == 0:
        num_str[-1] = "0"
    else:
        for idx in range(1, len(num_str)):
            if num_str[idx] == "0":
                num_str[idx] = "1"
                break

    num_str.reverse()
    for ch in num_str:
        if ch == "1":
            bin_sum += bin_pos
        bin_pos *= 2
    return bin_sum

num_str = list(input())
print(solution(num_str))