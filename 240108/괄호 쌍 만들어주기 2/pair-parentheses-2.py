def solution(pattern):
    count = 0
    for s_idx in range(len(pattern) -1):
        open_pattern = pattern[s_idx:s_idx + 2]
        if open_pattern.count("(") != 2:
            continue
        for e_idx in range(s_idx + 2, len(pattern) - 1):
            close_pattern = pattern[e_idx: e_idx + 2]
            if close_pattern.count(")") == 2:
                count += 1
    return count

pattern = list(input())
print(solution(pattern))