def solution(answers):
    answer = []
    
    one = [1, 2, 3, 4, 5]
    two = [2, 1, 2, 3, 2, 4, 2, 5]
    three = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    check = [0, 0, 0]
    
    for i in range(len(answers)):
        if answers[i] == one[i % len(one)]:
            check[0] += 1
        if answers[i] == two[i % len(two)]:
            check[1] += 1
        if answers[i] == three[i % len(three)]:
            check[2] += 1
    
    max_check = max(check)
    
    for i in range(len(check)):
        if check[i] == max_check:
            answer.append(i + 1)
            
    return answer