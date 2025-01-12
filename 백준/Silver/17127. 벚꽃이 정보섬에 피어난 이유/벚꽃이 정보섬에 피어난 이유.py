n = int(input())
tree = list(map(int, input().split()))

def calculate_final(a, b, c):
    return calculate_one(0, a) + calculate_one(a, b) + calculate_one(b, c) + calculate_one(c, n)

def calculate_one(start, end):
    ans = 1
    for i in range(start, end):
        ans *= tree[i]
    return ans

ans = 0
for i in range(1, n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            check = calculate_final(i, j, k)
            if ans < check:
                ans = check

print(ans)