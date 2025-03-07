import sys

n = int(sys.stdin.readline().strip())
arr = []

for i in range(n):
    x, y = map(int, sys.stdin.readline().strip().split())
    arr.append((x, y))

sorted_arr = sorted(arr, key=lambda x: (x[0], x[1]))

for i in sorted_arr:
    print(i[0], i[1])