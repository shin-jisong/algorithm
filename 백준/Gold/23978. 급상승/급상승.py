import sys

n, k = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

def sum_n(x, n):
    if n >= x:
        return x * (x + 1) // 2
    else:
        return n * (2 * x - n + 1) // 2

low, high = 0, k
answer = 0

while low <= high:
    mid = (low + high) // 2

    sum_arr = 0
    for i in range(n):
        if i == n - 1:
            sum_arr += sum_n(mid, mid)
        else:
            sum_arr += sum_n(mid, arr[i+1] - arr[i])
    if sum_arr >= k:
        answer = mid
        high = mid - 1
    else:
        low = mid + 1

print(answer)