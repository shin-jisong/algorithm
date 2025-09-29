def solution(word):
    count = 0
    answer = 0
    
    def check(now_word, max_len, word):
        nonlocal count
        nonlocal answer
        
        if now_word == word:
            answer = count
            return
        
        if max_len <= len(now_word):
            return
        
        alpha = ['A', 'E', 'I', 'O', 'U']
        for a in alpha:
            count += 1
            check(now_word + a, max_len, word)
        
    
    check("", 5, word)
    return answer