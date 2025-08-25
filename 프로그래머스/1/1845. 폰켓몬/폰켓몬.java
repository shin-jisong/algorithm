import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> mons = new HashMap<>();
        
        for(int n : nums) {
            if (mons.containsKey(n)) {
                mons.put(n, mons.get(n) + 1);
            } else {
                mons.put(n, 1);
            }
        }
        
        List<Integer> valueList = new ArrayList<>(mons.values());
        Collections.sort(valueList);
        
        int num = nums.length / 2;
        int answer = 0;
        for(int v: valueList) {
            answer += 1;
            num -= 1;
            
            if (num <= 0) break;
        }
        
        return answer;
    }
}