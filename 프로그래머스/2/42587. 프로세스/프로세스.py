def solution(priorities, location):
    answer = 0
    
    while len(priorities) != 0:
        if max(priorities) == priorities[0] and location == 0:
            answer += 1
            break
        elif priorities[0] != max(priorities):
            if location == 0:
                location = len(priorities) - 1
            else:
                location -= 1
            priorities.append(priorities.pop(0))
        elif priorities[0] == max(priorities):
            answer += 1
            priorities.pop(0)
            location -= 1
            
    return answer