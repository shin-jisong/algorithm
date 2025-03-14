import sys

n, m = map(int, sys.stdin.readline().strip().split())
arr = list(map(int, sys.stdin.readline().strip().split()))
arr.sort()

for _ in range(m):
    q = list(map(int, sys.stdin.readline().strip().split()))
    if q[0] == 1:
        flag = True
        for i in range(n):
            if arr[i] >= q[1]:
                print(n - i)
                flag = False
                break
        if flag:
            print(0)
    elif q[0] == 2:
        flag = True
        for i in range(n):
            if arr[i] > q[1]:
                print(n - i)
                flag = False
                break
        if flag:
            print(0)
    elif q[0] == 3:
        i = 0
        j = n - 1
        while i < n - 1 and j > 0:
            if arr[i] < q[1]:
                i += 1
            if arr[j] > q[2]:
                j -= 1
            if arr[i] >= q[1] and arr[j] <= q[2]:
                j += 1
                break
        print(j - i)