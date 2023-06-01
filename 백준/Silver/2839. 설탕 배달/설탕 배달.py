num = int(input())

check = num // 5
answer = -1
for i in range(check, -1, -1):
    result = num - (i * 5)
    if result % 3 == 0:
        answer = i + (result // 3)
        break

print(answer)