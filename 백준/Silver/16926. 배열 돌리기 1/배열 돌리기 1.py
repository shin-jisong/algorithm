import sys
read = lambda: list(map(int, sys.stdin.readline().rstrip().split(' ')))


def rotate(arr, x1, y1, x2, y2):
    temp = arr[x1][y1]

    # Rotate the top row
    for j in range(y1, y2):
        arr[x1][j] = arr[x1][j + 1]

    # Rotate the right column
    for i in range(x1, x2):
        arr[i][y2] = arr[i + 1][y2]

    # Rotate the bottom row
    for j in range(y2, y1, -1):
        arr[x2][j] = arr[x2][j - 1]

    # Rotate the left column
    for i in range(x2, x1, -1):
        arr[i][y1] = arr[i - 1][y1]

    arr[x1 + 1][y1] = temp  # Assign the stored value to the next position

    return arr


arr = []
n, m, r = read()
for i in range(n):
    arr.append(read())

for i in range(r):
    x1 = 0
    y1 = 0
    x2 = n
    y2 = m

    while True:
        arr = rotate(arr, x1, y1, x2-1, y2-1)
        x1 += 1
        y1 += 1
        x2 -= 1
        y2 -= 1
        if x1 == x2 or y1 == y2:
            break

for i in range(n):
    for j in range(m):
        print(arr[i][j], end=' ')
    print()