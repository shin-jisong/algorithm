def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = [0] * bridge_length
    sb = 0
    
    while len(truck_weights) != 0 or sb != 0:
        answer += 1
        if len(truck_weights) == 0:
            sb -= bridge.pop(0)
            bridge.append(0)
        elif sum(bridge) - bridge[0] + truck_weights[0] <= weight:
            sb -= bridge.pop(0)
            num = truck_weights.pop(0)
            sb += num
            bridge.append(num)
        else:
            sb -= bridge.pop(0)
            bridge.append(0)
            
    return answer