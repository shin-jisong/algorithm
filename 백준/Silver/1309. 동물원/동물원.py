import sys
n = int(sys.stdin.readline().rstrip())

lion = [[1,1,1]]

def lionCount(N):
    if N == 1:
        return 3
    else:
        for i in range(2, N+1):
            lionplus = [lion[0][1] + lion[0][2],
                        lion[0][0] + lion[0][2],
                        lion[0][0] + lion[0][1] + lion[0][2]]
            lion.append(lionplus)
            lion.pop(0)
        return sum(lion[-1])

print(lionCount(n) % 9901)
