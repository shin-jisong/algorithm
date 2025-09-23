from itertools import permutations

def solution(numbers):
    
    def is_prime(num):
        if num == 0 or num == 1:
            return False
        
        for i in range(2, num // 2 + 1):
            if num % i == 0:
                return False
        return True
    
    primes = set()
    nums = []
    for n in numbers:
        nums.append(n)
        
    for r in range(1, len(nums) + 1):
        for p in permutations(nums, r):
            num = int(''.join(map(str, p)))
            if is_prime(num):
                primes.add(num)
                
    return len(primes)