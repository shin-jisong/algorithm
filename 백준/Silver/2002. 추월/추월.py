import sys

n = int(sys.stdin.readline().rstrip())

carIn = []
carOut = []

for i in range(n):
    carIn.append(sys.stdin.readline().rstrip())

for i in range(n):
    carOut.append(sys.stdin.readline().rstrip())
res = 0
while carOut or carIn:
    target = carIn.pop(0)
    check = 0
    for i in carOut:
        if target == i:
            break
        else:
            check += 1
    res += check
    for i in range(check):
        carDelete = carOut.pop(0)
        carIn.remove(carDelete)
    carOut.pop(0)
print(res)
