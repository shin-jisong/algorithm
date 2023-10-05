import sys

t = int(sys.stdin.readline().rstrip())

def dfs(graph, k, ans, n, m, visited, need_visited):
    while need_visited:
        y, x = need_visited.pop()
        if [y, x] not in visited and graph[y][x] == 1:
            k -= 1
            dx = [-1, 1, 0, 0]
            dy = [0, 0, -1, 1]
            for q in range(4):
                new_x = x + dx[q]
                new_y = y + dy[q]
                if 0 <= new_x < m and 0 <= new_y < n:
                    need_visited.append([new_y, new_x])
            visited.append([y, x])
            graph[y][x] = 0

    if k <= 0:
        return ans
    ans += 1
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1:
                need_visited.append([i, j])
                break
        if need_visited:
            break
    return dfs(graph, k, ans, n, m, visited, need_visited)

for i in range(t):
    m, n, k = map(int, sys.stdin.readline().rstrip().split(' '))
    graph = [[0 for j in range(m)] for k in range(n)]
    for j in range(k):
        x, y = map(int, sys.stdin.readline().rstrip().split(' '))
        graph[y][x] = 1
    print(dfs(graph, k, 0, n, m, [], []))