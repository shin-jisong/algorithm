s = input()
t = input()

result = 0

def check(s, t):
    if s == t:
        print(1)
        exit()
    elif len(s) < len(t):
        if t[-1] == 'B':
            check(s, t[:-1][::-1])
        elif t[-1] == 'A':
            check(s, t[:-1])

check(s, t)
print(0)