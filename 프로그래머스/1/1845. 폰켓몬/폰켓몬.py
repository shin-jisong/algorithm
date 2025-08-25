def solution(nums):
    mon = {}
    
    for n in nums:
        if n in mon:
            mon[n] += 1
        else:
            mon[n] = 1
    
    num = len(nums) / 2
    val = sorted(mon.values())
    answer = 0
    
    print(val)
    for v in val:
        answer += 1
        num -= 1
        if num <= 0:
            break
            
    return answer