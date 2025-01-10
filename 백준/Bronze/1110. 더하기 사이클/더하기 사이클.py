n = int(input())

if n < 10:
    a = 0
    b = n
else:
    a = n // 10
    b = n % 10

count = 0

while True:
    count += 1
    temp = a
    a = b
    b = (b + temp) % 10
    if a * 10 + b == n:
        break

print(count)