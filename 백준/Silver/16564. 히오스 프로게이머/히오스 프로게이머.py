import sys
n, k = map(int, sys.stdin.readline().rstrip().split(' '))
level = []

for i in range(n):
    level.append(int(sys.stdin.readline().rstrip()))

level.sort()
result = 0
for i in range(n-1):
    result = i
    if level[i] < level[i+1]:
        gap = level[i+1] - level[i]
        if gap * (i+1) > k:
            break
        else:
            level[i] += gap
            k -= (gap * (i+1))

if len(level) > 1 and level[-1] == level[-2]:
    result = n-1

if k > result + 1:
    level[result] += k // (result + 1)

print(level[result])