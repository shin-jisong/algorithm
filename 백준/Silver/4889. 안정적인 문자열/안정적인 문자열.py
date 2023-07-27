import sys

turn = 0
while True:
    strCheck = sys.stdin.readline().rstrip()
    turn += 1
    if strCheck.startswith("-"):
        break
    res = 0
    check = 0

    for i in strCheck:
        if i == '{':
            check += 1
        else:
            check -= 1

        if check < 0:
            res += 1
            check += 2

    if check > 0:
        res += check // 2

    print(str(turn) + ". " + str(res))