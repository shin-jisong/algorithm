def solution(info, edges):
    answer = 0
    tree = {}
    for e in edges:
        if e[0] in tree:
            tree[e[0]].append(e[1])
        else:
            tree[e[0]] = [e[1]]
            
    def dfs(node, sheep, wolf, next_nodes):
        nonlocal answer
        if info[node] == 0:
            sheep += 1
        else:
            wolf += 1

        if sheep <= wolf:
            return
        
        answer = max(answer, sheep)
        
        for nxt in tree.get(node, []):
            next_nodes.append(nxt)
            
        for nxt in next_nodes:
            dfs(nxt, sheep, wolf, [x for x in next_nodes if x != nxt])

    dfs(0, 0, 0, [])
    return answer