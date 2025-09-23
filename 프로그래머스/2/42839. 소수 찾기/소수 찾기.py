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
        
    def backtrack(current, used):
        if current and is_prime(int(current)):
            primes.add(int(current))
        for i in range(len(nums)):
            if not used[i]:
                used[i] = True
                backtrack(current + str(nums[i]), used)
                used[i] = False
                
    used = [False] * len(nums)
    backtrack("", used)
                
    return len(primes)