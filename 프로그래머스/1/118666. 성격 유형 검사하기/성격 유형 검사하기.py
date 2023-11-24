def solution(survey, choices):
    answer = ""
    dic = {"R": 0, "T": 0, "C": 0, "F": 0, "J": 0, "M": 0, "A": 0, "N": 0}
    
    for i in range(len(survey)):
        svy = survey[i]
        num = choices[i]
        if num == 4:
            continue
        elif num <= 3:
            score = 4 - num
            dic[svy[0]] += score
        else:
            score = num - 4
            dic[svy[1]] += score
    
    keys_to_check = ['R', 'T', 'C', 'F', 'J', 'M', 'A', 'N']

    for i in range(0, len(keys_to_check), 2):
        current_key = keys_to_check[i]
        next_key = keys_to_check[i + 1]

        if dic[current_key] >= dic[next_key]:
            answer += current_key
        else:
            answer += next_key

    
    return answer