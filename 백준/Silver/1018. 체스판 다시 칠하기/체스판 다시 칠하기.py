n, m = map(int, input().split())
chess = [input() for _ in range(n)]

def is_chess_possible(i, j):
    if i + 8 <= n and j + 8 <= m:
        return True
    else:
        return False

def check_fix_color(i, j):
    white = check_fix("W", i, j)
    black = check_fix("B", i, j)
    if white > black:
        return black
    return white

def check_fix(color, i, j):
    count = 0
    for x in range(8):
        for y in range(8):
            if chess[i + x][j + y] != color:
                count += 1
            if y != 7:
                color = change_color(color)
    return count

def change_color(color):
    if color == "W":
        return "B"
    elif color == "B":
        return "W"

ans = 64
for i in range(n):
    for j in range(m):
        if is_chess_possible(i, j):
            fix = check_fix_color(i, j)
            if fix < ans:
                ans = fix
        if ans == 0:
            break
    if ans == 0:
        break
        
print(ans)