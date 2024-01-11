def solution(arr):
    for a in range(len(arr)):
        for b in range(len(arr)):
            for c in range(len(arr)):
                for d in range(len(arr)):
                    if arr[a] <= arr[b] <= arr[c] <= arr[d]:
                        if arr[a] + arr[b] in arr and\
                        arr[b] + arr[c] in arr and\
                        arr[c] + arr[d] in arr and\
                        arr[d] + arr[a] in arr and\
                        arr[a] + arr[c] in arr and\
                        arr[b] + arr[d] in arr and\
                        arr[a] + arr[b] + arr[c] in arr and\
                        arr[a] + arr[b] + arr[d] in arr and\
                        arr[a] + arr[c] + arr[d] in arr and\
                        arr[b] + arr[c] + arr[d] in arr and\
                        arr[a] + arr[b] + arr[c] + arr[d] in arr:
                            print(arr[a], arr[b], arr[c], arr[d])


numbers = list(set(map(int, input().split())))
arr = list(set(numbers))
arr.sort()
solution(arr)