import java.util.*;

class Solution {
    public void check(int target, int n, int[][] computers, boolean[] computer) {
        computer[target] = false;
        
        for (int i = 0; i < n; i++) {
            if (i != target && computers[target][i] == 1 && computer[i]) {
                check(i, n, computers, computer);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] computer = new boolean[n];
        Arrays.fill(computer, true);
        
        for(int i = 0; i < n; i++) {
           if (computer[i]) {
               answer += 1;
               check(i, n, computers, computer);
           }
        }
        return answer;
    }
}