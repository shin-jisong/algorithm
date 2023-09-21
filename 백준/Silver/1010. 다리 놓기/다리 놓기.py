import sys, math
t = int(sys.stdin.readline().rstrip())

for i in range(t):
    n, m = map(int, sys.stdin.readline().rstrip().split(' '))
    ans = math.factorial(m) // (math.factorial(n) * math.factorial(m-n))
    print(ans)