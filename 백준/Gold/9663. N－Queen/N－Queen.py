import sys

ans = 0
n = int(sys.stdin.readline())

def sol(arr):
    global ans
    if len(arr) == n:
        ans += 1
        return

    for i in range(n):
        flag = True
        for j in range(len(arr)):
            if i == arr[j]:
                flag = False
                break
            elif abs(j - len(arr)) == abs(arr[j] - i):
                flag = False
                break
        if flag:
            arr.append(i)
            sol(arr)
            arr.pop()

sol([])
print(ans)