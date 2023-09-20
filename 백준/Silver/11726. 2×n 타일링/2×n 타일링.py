import math
import sys
n = int(sys.stdin.readline().rstrip())

ans = 1
flag = 0

while n - flag:
    flag += 1
    n -= 1

    if n - flag < 0:
        break

    ans += (math.factorial(n) // (math.factorial(flag) * math.factorial(n - flag))) % 10007

print(ans % 10007)
