import sys

def solution(a, b, c):
    if b == 0:
        return 1
    half = solution(a, b // 2, c)
    if b % 2 == 0:
        return (half * half) % c
    else:
        return (half * half * a) % c

a, b, c = map(int, sys.stdin.readline().rstrip().split())
print(solution(a, b, c))