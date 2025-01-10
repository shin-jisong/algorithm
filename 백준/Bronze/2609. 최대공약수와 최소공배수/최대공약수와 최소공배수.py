n = list(map(int, input().split()))
a = n[0]
b = n[1]

r1 = a
r2 = b 

while True:
    if r2 == 0:
        break
    temp = r2
    r2 = r1 % r2
    r1 = temp
    
print(r1)
print(int(a * b / r1))