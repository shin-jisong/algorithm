n = int(input())
queue = []

for i in range(n):
    cmd = input()
    if cmd.startswith("push"):
        x = int(cmd.split()[1])
        queue.append(x)
    elif cmd == "pop":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue.pop(0))
    elif cmd == "size":
        print(len(queue))
    elif cmd == "empty":
        if len(queue) == 0:
            print(1)
        else:
            print(0)
    elif cmd == "front":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[0])
    elif cmd == "back":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[len(queue) -1])