import sys

n, m = map(int, sys.stdin.readline().rstrip().split())
arr = list(map(int, sys.stdin.readline().rstrip().split()))
ans = [0]

for i in range(n):
    ans.append(ans[i] + arr[i])

for _ in range(m):
    i, j = map(int, sys.stdin.readline().rstrip().split())
    print(ans[j] - ans[i - 1])