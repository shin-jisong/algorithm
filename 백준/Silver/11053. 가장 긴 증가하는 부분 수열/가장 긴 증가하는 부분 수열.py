import sys
n = int(sys.stdin.readline().rstrip())
p = list(map(int, (sys.stdin.readline().rstrip().split())))
dp = [0]

for i in range(1, n):
    length = 0
    for j in range(0, i):
        if p[j] < p[i]:
            length = max(dp[j] + 1, length)
    dp.append(length)
print(max(dp) + 1)