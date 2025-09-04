def solution(progresses, speeds):
    answer = []
    
    days = 0
    progress = 0
    for i in range(len(progresses)):
        if progresses[i] + speeds[i] * days >= 100:
            progress += 1
        else:
            if progress != 0:
                answer.append(progress)
                progress = 0
                
            remain = 100 - progresses[i]
            if remain % speeds[i] == 0:
                days = remain // speeds[i]
            else:
                days = remain // speeds[i] + 1
            progress += 1
    
    if progress != 0:
        answer.append(progress)
        
    return answer