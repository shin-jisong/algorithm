n = int(input())

def is_constructor(number):
    result = int(number)
    for i in range(len(number)):
        result += int(number[i])
    if result == n:
        return True
    else:
        return False

ans = 0
if n - 9 * len(str(n)) < 0:
    start_num = 0
else:
    start_num = n - 9 * len(str(n))

for i in range(start_num, n):
    if is_constructor(str(i)):
        ans = i
        break

print(ans)