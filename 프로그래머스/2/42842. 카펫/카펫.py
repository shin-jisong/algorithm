def solution(brown, yellow):
    check = (brown - 4) // 2
    answer = []
    for i in range(1, check // 2 + 1):
        if i * (check - i) == yellow:
            answer = [check - i + 2, i + 2]
            break
    return answer