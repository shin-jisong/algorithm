def solution(sizes):
    sl, ss = 0, 0
    answer = 0
    
    for s in sizes:
        if s[0] > s[1]:
            one, two = s[0], s[1]
        else:
            one, two = s[1], s[0]
        sl = max(one, sl)
        ss = max(two, ss)
        if answer < sl * ss:
            answer = sl * ss
    return answer