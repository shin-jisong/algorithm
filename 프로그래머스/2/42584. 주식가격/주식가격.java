import java.util.*;

class Solution {
    public List<Integer> solution(int[] prices) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            answer.add(0);
        }
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer.set(idx, i - idx);
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer.set(idx, prices.length - idx - 1);
        }
        return answer;
    }
}