def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = [0] * bridge_length
    
    while len(truck_weights) != 0 or sum(bridge) != 0:
        answer += 1
        if len(truck_weights) == 0:
            bridge.pop(0)
            bridge.append(0)
        elif sum(bridge) - bridge[0] + truck_weights[0] <= weight:
            bridge.pop(0)
            bridge.append(truck_weights.pop(0))
        else:
            bridge.pop(0)
            bridge.append(0)
            
    return answer