def check(target, n, computers, computer):
    computer[target] = False
    
    for i in range(n):
        if i != target and computers[target][i] == 1 and computer[i]:
            check(i, n, computers, computer)
            

def solution(n, computers):
    computer = [True] * n
    answer = 0
    
    for i in range(n):
        if computer[i]:
            answer += 1
            check(i, n, computers, computer)
            
    return answer