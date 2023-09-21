def solution(people, limit):
    answer = 0
    people.sort(reverse=True)
    left = 0
    right = len(people) - 1
    
    while True:
            
        if right - left >= 1 and people[left] + people[right] <= limit:
            answer += 1
            left += 1
            right -= 1
        else:
            answer += 1
            left += 1
            
        if left > right:
            break
        
    return answer
