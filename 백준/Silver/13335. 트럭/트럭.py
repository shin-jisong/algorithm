import sys
read = lambda: list(map(int, sys.stdin.readline().rstrip().split(' ')))

n, w, L = read()
truck = read()
road = [0 for i in range(w)]
ans = 0
count = 0
while True:
    check = road.pop(0)
    ans += 1
    if check != 0:
        count -= 1

    if truck:
        t = truck[0]
    else:
        t = 0

    if sum(road)+t <= L:
        if truck:
            truck.pop(0)
        road.append(t)
    else:
        road.append(0)

    if sum(road) == 0:
        break

print(ans)