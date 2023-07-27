import sys

n = int(sys.stdin.readline().rstrip())
m = int(sys.stdin.readline().rstrip())
s = sys.stdin.readline().rstrip()

sLen = 2 * n + 1
res = 0
checkS = "I" + "OI" * n
for i in range(m):
    if i + sLen <= m:
        if s[i:i+sLen] == checkS:
            res += 1

print(res)