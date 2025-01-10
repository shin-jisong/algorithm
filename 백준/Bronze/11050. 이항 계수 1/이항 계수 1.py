num = list(map(int, input().split()))
n = num[0]
k = num[1]

if n - k < k:
    k = n - k

ans = 1
count = 1

while count <= k:
    ans = ans * n / count
    n -= 1
    count += 1

print(int(ans))