from collections import deque

f, s, g, u, d = map(int, input().split())

visited = [-1] * (f + 1)
visited[s] = 0

queue = deque([s])
while queue:
    v = queue.popleft()

    if v == g:
        break

    next_up = v + u
    if next_up <= f and visited[next_up] == -1:
        visited[next_up] = visited[v] + 1
        queue.append(next_up)

    next_down = v - d
    if next_down >= 1 and visited[next_down] == -1:
        visited[next_down] = visited[v] + 1
        queue.append(next_down)

if visited[g] == -1:
    print("use the stairs")
else:
    print(visited[g])