coin, money = input().split()
arr = []
coin = int(coin)
money = int(money)
for i in range(coin):
    arr.append(int(input()))

count = 0
for i in range(coin - 1, -1, -1):
    countCoin = money // arr[i]
    count += countCoin
    money -= countCoin * arr[i]
    if money == 0:
        break

print(count)