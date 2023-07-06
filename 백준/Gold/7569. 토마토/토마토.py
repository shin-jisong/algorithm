from collections import deque

m, n, h = map(int, input().split())

box = []
for _ in range(h):
    layer = []
    for _ in range(n):
        layer.append(list(map(int, input().split())))
    box.append(layer)

dx = [-1, 1, 0, 0, 0, 0]
dy = [0, 0, -1, 1, 0, 0]
dz = [0, 0, 0, 0, -1, 1]

def tomatoNum(box):
    queue = deque()
    checkNum = 0

    for i in range(h):
        for j in range(n):
            for k in range(m):
                if box[i][j][k] == 1:
                    queue.append((i, j, k))
                elif box[i][j][k] == 0:
                    checkNum += 1

    if checkNum == 0:
        return 0

    days = -1
    while queue:
        days += 1
        for _ in range(len(queue)):
            z, x, y = queue.popleft()

            for i in range(6):
                nz = z + dz[i]
                nx = x + dx[i]
                ny = y + dy[i]

                if 0 <= nz < h and 0 <= nx < n and 0 <= ny < m and box[nz][nx][ny] == 0:
                    box[nz][nx][ny] = 1
                    queue.append((nz, nx, ny))

    for i in range(h):
        for j in range(n):
            for k in range(m):
                if box[i][j][k] == 0:
                    return -1

    return days

result = tomatoNum(box)
print(result)
