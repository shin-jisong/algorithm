from queue import PriorityQueue

def solution(jobs):
    jobs.sort(key=lambda x: x[0])
    answer = 0
    n = 0
    queue = PriorityQueue()
    time = 0
    
              
    while len(jobs) != 0 or not queue.empty():
        while True:
            if jobs and time >= jobs[0][0]:
                item = jobs.pop(0)
                queue.put((item[1], item[0], n))
                n += 1
            else:
                break
                
        if queue.empty():
            time += 1
            continue
        
        item = queue.get()
        time += item[0]
        answer += (time - item[1])
        
    return answer // n