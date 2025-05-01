import sys

def sol(targetX, targetY, startX, endX, startY, endY, depth, depthArr):
    depth -= 1
    if depth == -1:
        return

    midX = (startX + endX) // 2
    midY = (startY + endY) // 2

    if targetX <= midX and targetY <= midY:
        depthArr[depth] = 0
        sol(targetX, targetY, startX, midX, startY, midY, depth, depthArr)
    elif targetX > midX and targetY > midY:
        depthArr[depth] = 3
        sol(targetX, targetY, midX + 1, endX, midY + 1, endY, depth, depthArr)
    elif targetX <= midX and targetY > midY:
        depthArr[depth] = 1
        sol(targetX, targetY, startX, midX, midY + 1, endY, depth, depthArr)
    else:
        depthArr[depth] = 2
        sol(targetX, targetY, midX + 1, endX, startY, midY, depth, depthArr)

N, r, c = map(int, sys.stdin.readline().rstrip().split())
depthArr = [None] * N
sol(r, c, 0, 2 ** N - 1, 0, 2 ** N - 1, N, depthArr)

ans = 0
check = 1
for num in depthArr:
    ans += (num * check)
    check *= 4

print(ans)