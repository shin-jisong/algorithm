a, b = input().split()
A = int(a)
P = int(b)
arr = []

def cal(check):
    count = 0
    while check != 0:
        temp = check % 10
        count = count + (temp ** P)
        check = check // 10
    return count

while True:
    arr.append(A)
    A = cal(A)
    if A in arr:
        print(arr.index(A))
        break
