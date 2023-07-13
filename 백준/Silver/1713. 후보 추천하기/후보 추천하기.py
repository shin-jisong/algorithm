import sys
read = lambda: list(map(int, sys.stdin.readline().rstrip().split(' ')))

m = read()[0]
n = read()[0]
arr = read()

result = {}

for student in arr:
    if student in result:
        result[student] += 1
    else:
        if len(result.keys()) >= m:
            item = -1
            check = min(result.values())
            for key, value in result.items():
                if value == check:
                    item = key
                    break
            del result[item]
        result[student] = 1

for i in sorted(result.keys()):
    print(i, end=' ')