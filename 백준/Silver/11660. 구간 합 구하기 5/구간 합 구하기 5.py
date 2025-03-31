import sys

def check(ans, x1, y1, x2, y2):
    answer = ans[x2][y2]
    if x1 > 0:
        answer -= ans[x1-1][y2]
    if y1 > 0:
        answer -= ans[x2][y1 - 1]
    if x1 > 0 and y1 > 0:
        answer += ans[x1-1][y1-1]
    return answer

n, m = map(int, sys.stdin.readline().rstrip().split())
arr = []

for _ in range(n):
    line = list(map(int, sys.stdin.readline().rstrip().split()))
    arr.append(line)

ans = [[0 for _ in range(n)] for _ in range(n)]

for i in range(n):
    for j in range(n):
        if i == 0 and j == 0:
            ans[i][j] = arr[i][j]
        elif i == 0:
            ans[i][j] = ans[i][j-1] + arr[i][j]
        elif j == 0:
            ans[i][j] = ans[i-1][j] + arr[i][j]
        else:
            ans[i][j] = ans[i-1][j] + ans[i][j-1] + arr[i][j] - ans[i-1][j-1]

for _ in range(m):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().rstrip().split())
    print(check(ans, x1-1, y1-1, x2-1, y2-1))

