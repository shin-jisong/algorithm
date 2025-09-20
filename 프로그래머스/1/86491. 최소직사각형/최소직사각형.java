import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int sl = 0, ss = 0;
        int one, two;
        
        for (int[] s : sizes) {
            if (s[0] > s[1]) {
                one = s[0];
                two = s[1];
            }
            else {
                one = s[1];
                two = s[0];
            }
            
            sl = Math.max(one, sl);
            ss = Math.max(two, ss);
            
            if (answer < sl * ss) answer = sl * ss;
        }
        return answer;
    }
}