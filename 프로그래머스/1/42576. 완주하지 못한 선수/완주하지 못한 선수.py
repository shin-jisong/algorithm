def solution(participant, completion):
    dic_c = {}
    answer = ""
    for c in completion:
        if c in dic_c:
            dic_c[c] += 1
        else:
            dic_c[c] = 1
    
    for p in participant:
        if p not in dic_c:
            answer = p
            break
        
        if dic_c[p] == 0:
            answer = p
            break
        else:
            dic_c[p] -= 1
    
    return answer