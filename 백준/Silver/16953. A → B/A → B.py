
a, b = input().split()
a = int(a)
b = int(b)

visited = []
flag = -1

def dfs(v, visited, num):
    global flag
    visited.append(v)
    if v == b:
        if flag == -1:
            flag = num
        elif num < flag:
            flag = num
        return

    if v > b:
        return

    if v*2 not in visited:
        dfs(v*2, visited, num+1)

    if int(str(v)+'1') not in visited:
        dfs(int(str(v)+'1'), visited, num+1)

dfs(a, visited, 1)
print(flag)