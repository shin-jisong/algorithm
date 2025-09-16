import heapq

def solution(operations):
    max_heap = []
    min_heap = []
    valid = set()
    idx = 0
    
    for o in operations:
        if o.startswith("I"):
            num = int(o.split()[1])
            heapq.heappush(max_heap, (-num, idx))
            heapq.heappush(min_heap, (num, idx))
            valid.add(idx)
            idx += 1
        elif o == "D 1":
            while max_heap:
                item = heapq.heappop(max_heap)
                if item[1] in valid:
                    valid.remove(item[1])
                    break
        elif o == "D -1":
            while min_heap:
                item = heapq.heappop(min_heap)
                if item[1] in valid:
                    valid.remove(item[1])
                    break
    
    if len(valid) == 0:
        return [0, 0]
    
    min_value = 0
    max_value = 0
    while valid and min_heap:
        item = heapq.heappop(min_heap)
        if item[1] in valid:
            valid.remove(item[1])
            min_value = item[0]
            max_value = item[0]
            break
    while valid and max_heap:
        item = heapq.heappop(max_heap)
        if item[1] in valid:
            valid.remove(item[1])
            if -item[0] > max_value:
                max_value = -item[0]
            break
    return [max_value, min_value]
    