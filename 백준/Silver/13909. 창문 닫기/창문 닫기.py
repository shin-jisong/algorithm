n = int(input())

temp = 0
ans = 0
count = 3

while temp < n:
    temp += count
    count += 2
    ans += 1

print(ans)