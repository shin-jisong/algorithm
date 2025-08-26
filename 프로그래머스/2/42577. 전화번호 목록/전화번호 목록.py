def solution(phone_book):
    phone_book.sort()
    
    books = set()
    for p in phone_book:
        for i in range(1, len(p) + 1):
            if p[:i] in books:
                return False
        books.add(p)
    
    return True