n, m = input().split()
n = int(n)
m = int(m)

arr = [list(input()) for _ in range(n)]

max = 0
if n <= m: max = n
else: max = m

max -= 1

answer = 1
while max > 0:
    for i in range(n):
        for j in range(m):
            if j + max >= m or i + max >= n:
                break
            if arr[i][j] == arr[i+max][j] and arr[i][j] == arr[i][j+max] and arr[i][j] == arr[i+max][j+max]:
                answer = (max+1) * (max+1)
                break
    if answer != 1:
        break
    max -= 1

print(answer)