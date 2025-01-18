n = int(input())
stack = []

for i in range(n):
    cmd = input()
    if cmd.startswith("push"):
        num = cmd.split()[1]
        stack.append(int(num))
    elif cmd == "pop":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    elif cmd == "size":
        print(len(stack))
    elif cmd == "empty":
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif cmd == "top":
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[len(stack) - 1])