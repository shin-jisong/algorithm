def solution(n, lost, reserve):
    answer = n
    lost.sort()
    reserve.sort()
    
    need_to_remove = []
    for l in lost:
        if l in reserve:
            need_to_remove.append(l)
            
    for n in need_to_remove:
        lost.remove(n)
        reserve.remove(n)
    
    while lost and reserve:
        if lost[0] - 1 > reserve[0]:
            reserve.pop(0)
        elif lost[0] + 1 < reserve[0]:
            answer -= 1
            lost.pop(0)
        elif lost[0] + 1 == reserve[0] or lost[0] - 1 == reserve[0]:
            lost.pop(0)
            reserve.pop(0)
    
    answer -= len(lost)
            
    return answer