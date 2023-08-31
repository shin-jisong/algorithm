import sys
n = int(sys.stdin.readline().rstrip())
wine = []
dp = []

for i in range(n):
    wine.append(int(sys.stdin.readline().rstrip()))

for i in range(n):
    if i == 0:
        dp.append(wine[0])
    elif i == 1:
        dp.append(wine[0] + wine[1])
    elif i == 2:
        dp.append(max(wine[0] + wine[2], wine[1] + wine[2], dp[1]))
    else:
        dp.append(max(dp[i-3] + wine[i-1] + wine[i], dp[i-2] + wine[i], dp[i-1]))
print(max(dp))