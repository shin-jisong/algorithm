import sys
from collections import deque
read = lambda: list(map(int, sys.stdin.readline().rstrip().split(' ')))

n, m = read()

graph = [[] for _ in range(n+1)]
for i in range(m):
    a, b = read()
    graph[b].append(a)

num = 0

def bfs(graph, start, visited):
    global num
    queue = deque([start])
    visited[start] = True
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                num += 1
                queue.append(i)
                visited[i] = True

max = 0
result = []
for i in range(1, n+1):
    visited = [False] * (n+1)
    num = 0
    bfs(graph, i, visited)
    if max < num:
        max = num
        result.clear()

    if max == num:
        result.append(str(i))

print(' '.join(result))