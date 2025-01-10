n = int(input())
words = [input() for _ in range(n)]

ans = ""

for i in range(0, len(words[0])):
    target = words[0][i]
    for j in range(1, n):
        if target != words[j][i]:
            target = "?"
            break
    ans += target

print(ans)