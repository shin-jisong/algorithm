n = int(input())

def is_continued(number):
    if int(number) < 100:
        return True
    gap = int(number[0]) - int(number[1])
    for i in range(1, len(number) - 1):
        if int(number[i]) - int(number[i+1]) != gap:
            return False
    return True

ans = 0
for i in range(1, n + 1):
    if is_continued(str(i)):
        ans += 1
print(ans)