import sys

n = int(sys.stdin.readline().rstrip())

if n == 1:
    print(9)
    exit()

arr = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1]

for i in range(1, n):
    arrCheck = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    for j in range(10):
        if j == 0:
            arrCheck[1] += arr[0]
        elif j == 9:
            arrCheck[8] += arr[9]
        else:
            arrCheck[j+1] += arr[j]
            arrCheck[j-1] += arr[j]
    for k in range(10):
        arrCheck[k] %= 1000000000
    arr = arrCheck

result = sum(arr) % 1000000000
print(result)