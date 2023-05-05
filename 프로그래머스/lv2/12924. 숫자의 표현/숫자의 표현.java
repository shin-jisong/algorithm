import java.util.*;

class Solution {
    public int solution(int n) {
        
        int answer = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        if(n <= 1)
            return 1;
        
        for(int i = 1; i <= n; i++) {
            
            queue.add(i);
            sum += i;
            
            if(sum > n){
                while(sum >= n) {
                    sum -= queue.poll();
                    if(sum == n) {
                        answer++;
                    }
                    
                }

            }
            
            if(sum == n) {
                answer++;
            }
        }
        return answer;
    }
}