import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> mon = new HashMap<>();
        
        for(int i : nums) {
            if(mon.containsKey(i)) {
                mon.put(i, mon.get(i) + 1);
            }
            else {
                mon.put(i, 1);
            }
        }
        
        int max = nums.length / 2;
        if(max <= mon.size())
            answer = max;
        else
            answer = mon.size();
        
        return answer;
    }
}