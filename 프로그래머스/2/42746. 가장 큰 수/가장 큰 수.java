import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> nums = new ArrayList<>();
        for (int n : numbers) {
            nums.add(Integer.toString(n));
        }
        
        nums.sort((a, b) -> b.repeat(4).compareTo(a.repeat(4)));
        String answer = "";
        for(String s: nums) {
            answer += s;
        }
        
        if (nums.get(0).equals("0")) {
            return "0";
        }
        return answer;
    }
}