def solution(clothes):
    cloth = {}
    for c in clothes:
        if c[1] in cloth:
            cloth[c[1]] += 1
        else:
            cloth[c[1]] = 1
    
    cvalues = cloth.values()
    answer = 1
    for c in cvalues:
        answer *= (c+1)
    
    return answer - 1