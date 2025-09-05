def solution(s):
    answer = True
    
    count = 0
    for i in s:
        if i == "(":
            count += 1
        if i == ")":
            if count <= 0:
                answer = False
                break
            count -= 1
    
    if count != 0:
        answer = False

    return answer