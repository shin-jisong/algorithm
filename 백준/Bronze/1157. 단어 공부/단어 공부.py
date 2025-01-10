word = input()
dic = {}

for i in word:
    target = i.upper()
    if target in dic:
        dic[target] = dic[target] + 1
    else:
        dic[target] = 1

sortedDic = dict(sorted(dic.items(), key=lambda x: x[1], reverse=True))

if len(dic) == 1:
    dicKeys = list(dic.keys())
    print(dicKeys[0])
else:
    sortedDic = dict(sorted(dic.items(), key=lambda x: x[1], reverse=True))
    dicKeys = list(sortedDic.keys())
    if sortedDic[dicKeys[0]] == sortedDic[dicKeys[1]]:
        print("?")
    else:
        print(dicKeys[0])
