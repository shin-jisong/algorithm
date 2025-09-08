def solution(prices):
    answer = [0] * len(prices)
    stack = []
    
    for i in range(len(prices)):
        while stack and prices[stack[-1]] > prices[i]:
            answer[stack[-1]] = i - stack[-1]
            stack.pop()
        stack.append(i)
        
    for s in stack:
        answer[s] = len(prices) - s - 1
        
    return answer