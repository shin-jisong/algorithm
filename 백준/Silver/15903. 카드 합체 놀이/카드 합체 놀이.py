a, b = input().split()
m = int(a)
n = int(b)
arr = list(map(int, input().split()))

for i in range(n):
    arr.sort()
    arr[0] = arr[0] + arr[1]
    arr[1] = arr[0]

print(sum(arr))