def solution(n):
    arr = [0, 1]
    for i in range(2, n + 1):
        arr.append((arr[i - 1] + arr[i - 2]) % 1234567)
    
    return arr[n]