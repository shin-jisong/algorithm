import sys

arr = [(1, 0), (0, 1)]

for i in range(2, 41):
    arr.append((arr[i-2][0] + arr[i-1][0], arr[i-2][1] + arr[i-1][1]))

T = int(sys.stdin.readline().rstrip())

for _ in range(T):
    num = int(sys.stdin.readline().rstrip())
    print(arr[num][0], arr[num][1])