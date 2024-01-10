def solution(N, seats):
    available_positions = []
    best_diff = 1
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
    for available_seat in available_positions:
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
    last_available_seat = available_positions[-1]
    if last_available_seat.count(0) > 1 and last_available_seat.count(1) == 1:
        # print(last_available_seat)
        # print(best_diff, len(last_available_seat))
        best_diff = max(best_diff, len(last_available_seat) - 1)
    # print(available_positions)
    return best_diff


N = int(input())
seats = list(map(int, list(input())))
print(solution(N, seats))