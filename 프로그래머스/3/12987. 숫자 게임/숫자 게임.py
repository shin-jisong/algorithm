def solution(A, B):
    answer = 0
    A.sort()
    B.sort()
    while len(B) > 0:
        if B[0] <= A[0]:
            B.pop(0)
        else:
            answer += 1
            A.pop(0)
            B.pop(0)
    return answer