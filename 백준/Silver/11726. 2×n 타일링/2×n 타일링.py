import sys

n = int(sys.stdin.readline())

ans = [0, 1, 2, 3, 5, 8]

for i in range(6, n + 1):
    ans.append((ans[i-1] + ans[i-2]) % 10007)
    
print(ans[n])
