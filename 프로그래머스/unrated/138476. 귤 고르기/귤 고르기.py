def solution(k, tangerine):
    
    dic = {}
    
    for i in tangerine:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    dic = sorted(dic.items(), reverse=True, key=lambda item: item[1])
    
    ans = 0
    cnt = 0
    
    for key, value in dic:
        ans += 1
        cnt += value
        
        if cnt >= k:
            break
            
    return ans