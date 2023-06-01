num = int(input())

for i in range(num):
    check = int(input())
    arr = [0] * (check + 1)
    count = 1
    for j in range(check):
        a, b = input().split()
        a = int(a)
        b = int(b)
        arr[a] = b

    rank = arr[1]
    for j in range(2, check+1):
        if arr[j] < rank:
            count += 1
            rank = arr[j]

    print(count)