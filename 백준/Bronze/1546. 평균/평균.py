n = int(input())
score = list(map(int, input().split()))
score.sort(reverse=True)
maxScore = score[0]

average = sum(score) * 100 / maxScore / n
print(average)
