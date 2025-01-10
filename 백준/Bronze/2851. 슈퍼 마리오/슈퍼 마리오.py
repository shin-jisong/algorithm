num = [int(input()) for _ in range(10)]
score = 0

def compare(a, b):
    if abs(a - 100) > abs(b - 100):
        return b
    elif abs(a - 100) == abs(b - 100):
        if a > b:
            return a
        else:
            return b
    else:
        return a

count = 0
for i in range(10):
    count += num[i]
    score = compare(score, count)
    if count > 100:
            break
            
print(score)