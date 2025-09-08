import heapq

def solution(scoville, K):
    heapq.heapify(scoville) 
    answer = 0
    
    while True:
        if len(scoville) <= 1 and scoville[0] < K:
            answer = -1
            break
        if scoville[0] >= K:
            break
        
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        
        heapq.heappush(scoville, first + second * 2)
        answer += 1
        
    return answer