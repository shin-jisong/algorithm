import sys
n = int(sys.stdin.readline().rstrip())
p = list(map(int, (sys.stdin.readline().rstrip().split())))
p.insert(0, 0)
dp = [0]

for i in range(1, n+1):
    if i == 1:
        dp.append(p[1])
    else:
        maxNum = p[i]
        if (i - 1) % 2 == 0:
            checkNum = i // 2 + 1
        else:
            checkNum = i // 2 + 2
        if i == 2:
            checkNum = 2

        for j in range(1, checkNum):
            if dp[j] + dp[i-j] > maxNum:
                maxNum = dp[j] + dp[i-j]
        dp.append(maxNum)

print(dp[n])