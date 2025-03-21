def solution(my_string):
    answer = ''
    arr = set()
    for ctr in my_string:
        if ctr not in arr:
            arr.add(ctr)
            answer += ctr
    return answer