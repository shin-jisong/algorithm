def solution(k, dungeons):
    answer = -1
    
    def check(k, dungeons, visited, count):
        nonlocal answer
        if count > answer:
            answer = count
            
        for i in range(len(dungeons)):
            if not visited[i] and dungeons[i][0] <= k:
                visited[i] = True
                check(k - dungeons[i][1], dungeons, visited, count + 1)
                visited[i] = False
                
    visited = [False] * len(dungeons)
    check(k, dungeons, visited, 0)
    
    return answer