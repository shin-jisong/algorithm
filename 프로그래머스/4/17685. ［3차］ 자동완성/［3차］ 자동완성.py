def solution(words):
    trie = {}  
    
    for word in words:
        node = trie
        for ch in word:
            if ch not in node:
                node[ch] = {'count': 0, 'next': {}}
            node[ch]['count'] += 1
            node = node[ch]['next']

    answer = 0
    for word in words:
        node = trie
        for i, ch in enumerate(word, 1):
            if node[ch]['count'] == 1:
                answer += i
                break
            node = node[ch]['next']
        else:
            answer += len(word)

    return answer