import sys
n = int(sys.stdin.readline().rstrip())

arr = [1, 1, 1, 2, 2, 3, 4, 5, 7]

for i in range(9, 100):
    arr.append(arr[i-1] + arr[i-5])

for i in range(n):
    check = int(sys.stdin.readline().rstrip())
    print(arr[check-1])