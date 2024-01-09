def calc_performence(temp, low, high, C, G, H):
    if temp < low:
        return C
    elif temp <= high:
        return G
    else:
        return H

def solution(N, C, G, H, device_temp):
    min_temp = 1001
    max_temp = -1
    best_performence = 0

    for low, high in device_temp:
        min_temp = min(min_temp, low)
        max_temp = max(max_temp, high)
    
    for temp in range(min_temp-1, max_temp+1):
        total_performence = 0
        for low, high in device_temp:
            total_performence += calc_performence(temp, low, high, C, G, H)
        best_performence = max(best_performence, total_performence)
    return best_performence


N, C, G, H = map(int, input().split())
device_temp = [tuple(map(int, input().split())) for _ in range(N)]
print(solution(N, C, G, H, device_temp))