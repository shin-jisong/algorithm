n, c = map(int, input().split())
numbers = [int(input()) for _ in range(n)]
count = 0
clocks = [False] * (c + 1)

if 1 in numbers:
    count = c
else:
    for num in numbers:
        time = 0
        while time + num <= c:
            time += num
            if clocks[time]:
                continue
            clocks[time] = True
            count += 1

print(count)