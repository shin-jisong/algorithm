def solution(numbers):
    nums = [str(i) for i in numbers]
    numbers = sorted(nums, key = lambda x : x * 4, reverse = True)
    answer = ''
    for n in numbers:
        answer += n
    return str(int(answer))