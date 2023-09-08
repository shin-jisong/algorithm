import sys
n = int(sys.stdin.readline().rstrip())
p = list(map(int, (sys.stdin.readline().rstrip().split())))
dp = []

for i in range(n):
    if i == 0:
        dp.append(p[i])
    else:
        dp.append(max(p[i], p[i] + dp[i-1]))
print(max(dp))