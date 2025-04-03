import sys

n = int(sys.stdin.readline().rstrip())
arr = []
for _ in range(n):
    start, end = map(int, sys.stdin.readline().rstrip().split())
    arr.append((start, end))

arr = sorted(arr, key=lambda x: (x[1], x[0]))
count = 0
end = 0

for i in range(n):
    if end <= arr[i][0]:
        end = arr[i][1]
        count += 1
        
print(count)