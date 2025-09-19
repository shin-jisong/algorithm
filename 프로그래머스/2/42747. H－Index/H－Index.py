def solution(citations):
    answer = 0
    citations = sorted(citations, reverse = True)
    n = len(citations)
    for i in range(n):
        h = i + 1
        if citations[i] >= h:  
            answer = h          
        else:                   
            break
    return answer