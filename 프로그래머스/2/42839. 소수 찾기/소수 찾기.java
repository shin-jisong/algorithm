import java.util.*;

class Solution {
    Set<Integer> primes = new HashSet<>();
    
    public boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;
        for (int i = 2; i < num / 2 + 1; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public void backtrack(String temp, List<Boolean> used, List<String> nums) {
        if (temp.length() != 0 && isPrime(Integer.parseInt(temp))) {
            primes.add(Integer.parseInt(temp));
        }
        for (int i = 0; i < nums.size(); i++) {
            if (!used.get(i)) {
                used.set(i, true);
                backtrack(temp + nums.get(i), used, nums);
                used.set(i, false);
            }
        }
    }
    
    public int solution(String numbers) {
        List<String> nums = new ArrayList<>();
        List<Boolean> used = new ArrayList<>();
        for(int i = 0; i < numbers.length(); i++) {
            nums.add(Character.toString(numbers.charAt(i)));
            used.add(false);
        }
        backtrack("", used, nums);
        return primes.size();
    }
}