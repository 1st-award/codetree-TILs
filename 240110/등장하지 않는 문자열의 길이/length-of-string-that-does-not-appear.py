def solution(N, words):
    for x in range(N):
        all_pass = False
        cut_words = []
        for i in range(N - x):
            cut_words.append(''.join(words[i : i + x + 1]))
        # print(cut_words)
        for target_word in cut_words:
            # print(x, y, target_word)
            # print(target_word, cut_words.count(target_word))
            if cut_words.count(target_word) > 1: 
                # print(target_word, cut_words)
                all_pass = True
                break

        if not all_pass:
            return x + 1
    return N


N = int(input())
words = list(input())
print(solution(N, words))