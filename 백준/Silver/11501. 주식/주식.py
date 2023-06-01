check = int(input())

for i in range(check):
    count = int(input())
    arr = list(map(int, input().split()))
    nowMax = arr[count-1]
    money = 0
    for j in range(count-2, -1, -1):
        if nowMax > arr[j]:
            money += (nowMax - arr[j])

        if nowMax < arr[j]:
            nowMax = arr[j]
    print(money)