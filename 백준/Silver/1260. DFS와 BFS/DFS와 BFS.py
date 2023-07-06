from collections import deque
# BFS 메서드 정의
def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True


def dfs(graph, v, visited):
    visited[v] = True
    print(v, end=' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

n, m, v = input().split()
n = int(n)
v = int(v)
m = int(m)
visited = [False] * (n+1)

graph = [[] for _ in range(n+1)]
for i in range(m):
    a, b = input().split()
    graph[int(a)].append(int(b))
    graph[int(b)].append(int(a))

for i in range(n+1):
    graph[i].sort()

dfs(graph, v, visited)

print()
visited = [False] * (n+1)
bfs(graph, v, visited)