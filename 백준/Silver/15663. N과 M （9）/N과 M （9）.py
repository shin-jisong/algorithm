import sys

def solution(n, m, ans, now, arr):
    if len(now) == m:
        result = [arr[i] for i in now]
        res = " ".join(map(str, result))
        if res not in ans:
            ans.add(res)
            print(res)
        return

    for i in range(n):
        if i not in now:
            now.append(i)
            solution(n, m, ans, now, arr)
            now.pop(-1)


n, m = map(int, sys.stdin.readline().rstrip().split())
arr = list(map(int, sys.stdin.readline().rstrip().split()))

arr.sort()

solution(n, m, set(), [], arr)



