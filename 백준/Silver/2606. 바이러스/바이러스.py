import sys
from collections import deque


def dfs(graph, start):
    visited = []
    need_visited = deque()
    need_visited.append(start)
    ans = 0
    while need_visited:
        node = need_visited.pop()
        if node not in visited:
            if node != 1:
                ans += 1
            visited.append(node)
            need_visited.extend(graph[node])

    return ans


n = int(sys.stdin.readline().rstrip())
r = int(sys.stdin.readline().rstrip())

graph = {i: [] for i in range(1, n + 1)}

for i in range(r):
    s, f = map(int, sys.stdin.readline().rstrip().split(' '))
    graph[s].append(f)
    graph[f].append(s)


print(dfs(graph, 1))