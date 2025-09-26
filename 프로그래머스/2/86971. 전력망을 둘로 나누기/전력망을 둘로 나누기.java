import java.util.*;

class Solution {
    int num = 0;
    
    public void check(List<Boolean> visited, int[][] wires, int startNum) {
        for (int[] w : wires) {
            int nextNum;
            if (w[0] == startNum && !visited.get(w[1] - 1)) {
                nextNum = w[1];
            } else if (w[1] == startNum && !visited.get(w[0] - 1)) {
                nextNum = w[0];
            } else {
                continue;
            }
            
            num += 1;
            visited.set(nextNum - 1, true);
            check(visited, wires, nextNum);
            visited.set(nextNum - 1, false);
        }
    }
    
    public int solution(int n, int[][] wires) {
        List<Boolean> visited = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            visited.add(false);
        }
        
        int answer = -1;
        int one, two;
        for (int[] w: wires) {
            visited.set(w[0] - 1, true);
            visited.set(w[1] - 1, true);
            
            num = 1;
            check(visited, wires, w[0]);
            one = num;
            
            num = 1;
            check(visited, wires, w[1]);
            two = num;
            
            if (answer == -1) answer = Math.abs(one - two);
            else if (answer > Math.abs(one - two)) answer = Math.abs(one - two);
            
            visited.set(w[0] - 1, false);
            visited.set(w[1] - 1, false);
        }
        
        return answer;
    }
}