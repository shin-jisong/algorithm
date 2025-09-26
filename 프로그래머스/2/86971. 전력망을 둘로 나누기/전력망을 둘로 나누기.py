def solution(n, wires):
    num = 0
    def check(visited, start_num):
        nonlocal num
        for w in wires:
            if start_num not in w:
                continue
            if start_num == w[0] and not visited[w[1] - 1]:
                next_num = w[1] 
            elif start_num == w[1] and not visited[w[0] - 1]:
                next_num = w[0]
            else:
                continue
            num += 1
            visited[next_num - 1] = True
            check(visited, next_num)
            visited[next_num - 1] = False
            
    answer = -1
    visited = [False] * n
    for w in wires:
        visited[w[0] - 1] = True
        visited[w[1] - 1] = True
        num = 1
        check(visited, w[0])
        one = num
        num = 1
        check(visited, w[1])
        two = num
        if answer == -1: 
            answer = abs(one - two)
        elif answer > abs(one - two):
            answer = abs(one - two)
        visited[w[0] - 1] = False
        visited[w[1] - 1] = False
        
    return answer