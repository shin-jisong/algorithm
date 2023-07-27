import sys

n = int(sys.stdin.readline().rstrip())
m = int(sys.stdin.readline().rstrip())
s = sys.stdin.readline().rstrip()

sLen = 2 * n + 1

def check(s):
    ch = 'I'
    ans = True
    for i in s:
        if i != ch:
            ans = False
            break
        if ch == 'I':
            ch = 'O'
        else:
            ch = 'I'
    return ans

res = 0
for i in range(m):
    if i + sLen <= m:
        if check(s[i:i+sLen]):
            res += 1

print(res)