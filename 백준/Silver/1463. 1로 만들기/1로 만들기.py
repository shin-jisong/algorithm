import sys

N = int(sys.stdin.readline())

arr = [0, 0, 1, 1]

for i in range(4, N + 1):
    ans = []
    if i % 3 == 0:
        ans.append(1 + arr[i//3])
    if i % 2 == 0:
        ans.append(1 + arr[i//2])
    ans.append(1 + arr[i-1])
    ans.sort()
    arr.append(ans[0])

print(arr[N])
