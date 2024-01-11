# 추가할 사람을 최대한의 거리에 배치하면서
# 추가한 사람 포함 가장 가까운 두 사람 간의 거리를 최대로
def solution(N, seats):
    available_positions = []
    best_diff = 1
    best_diff_pos = 0, 0
    start = 0
    is_open = False
    if seats.count(0) == 0:
        return 0

    for i in range(N):
        if seats[i] == 1:
            if is_open:
                start = i
                is_open = True
            elif start != i:
                available_positions.append(seats[start : i + 1])
                start = i
    if start != N - 1:
        available_positions.append(seats[start:])
    for n in range(len(available_positions)):
        available_seat = available_positions[n]
        if available_seat.count(0) < 3:
            continue
        for idx in range(1, len(available_seat) - 1):
            if available_seat[idx] == 1:
                continue
            start_position_diff = idx
            end_position_diff = len(available_seat) - (idx + 1)
            # print(start_position_diff, end_position_diff)
            if start_position_diff == end_position_diff:
                # print(available_seat, len(available_seat))
                # print(start_position_diff, end_position_diff)
                best_diff = max(best_diff, start_position_diff)
                if best_diff == start_position_diff:
                    best_diff_pos = n, idx
                
    last_available_seat = available_positions[-1]
    if last_available_seat.count(0) > 1 and last_available_seat.count(1) == 1:
        # print(last_available_seat)
        # print(best_diff, len(last_available_seat))
        best_diff = max(best_diff, len(last_available_seat) - 1)
        if best_diff == len(last_available_seat) - 1:
            best_diff_pos = len(available_positions) - 1, len(last_available_seat) - 1

    first_available_seat = available_positions[0]
    if first_available_seat.count(0) > 1 and first_available_seat.count(1) == 1:
        # print(last_available_seat)
        # print(best_diff, len(last_available_seat))
        best_diff = max(best_diff, len(first_available_seat) - 1)
        if best_diff == len(first_available_seat) - 1:
            best_diff_pos = 0, 0
            
    # print(available_positions)
    y, x = best_diff_pos
    available_positions[y][x] = 1
    temp = []
    distance = 1001
    # print(available_positions)
    for seat in available_positions:
        if seat.count(1) >= 2:
            start_pos = False
            save_pos = -1
            for pos in range(len(seat)):
                if seat[pos] == 1:
                    if not start_pos:
                        save_pos = pos
                        start_pos = True
                    else:
                        distance = min(distance, pos - save_pos)
                        # print(distance)
                        save_pos = pos
    return distance


N = int(input())
seats = list(map(int, list(input())))
print(solution(N, seats))