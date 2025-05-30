import sys

str1 = sys.stdin.readline().rstrip()
str2 = sys.stdin.readline().rstrip()
ans = [[0] * (len(str2) + 1) for _ in range(len(str1) + 1)]

for i in range(1, len(str1) + 1):
    for j in range(1, len(str2) + 1):
        if str1[i - 1] == str2[j - 1]:
            ans[i][j] = ans[i-1][j-1] + 1
        else:
            ans[i][j] = max(ans[i-1][j], ans[i][j-1])

print(ans[len(str1)][len(str2)])
