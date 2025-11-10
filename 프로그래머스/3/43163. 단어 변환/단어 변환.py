def solution(begin, target, words):
    answer = 0
    
    def check_one_char(word1, word2):
        check = 0
        for i in range(len(word1)):
            if word1[i] != word2[i]:
                check += 1
        if check == 1:
            return True
        else:
            return False
        
    def dfs(word, cnt, visited):
        nonlocal target, answer
        if word == target:
            if answer == 0:
                answer = cnt
            elif answer > cnt:
                answer = cnt
            return
        elif answer != 0 and cnt > answer:
            return
        
        for i in range(len(words)):
            if check_one_char(word, words[i]) and not visited[i]:
                visited[i] = True
                dfs(words[i], cnt + 1, visited)
                visited[i] = False
    
    visited = [False] * len(words)
    dfs(begin, 0, visited)
    return answer