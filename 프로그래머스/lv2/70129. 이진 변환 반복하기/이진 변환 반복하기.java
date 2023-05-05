import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int count = 0;
        int check = 0;
        String str = "";
        while(s.length() > 1) {
            check++;
            str = "";
            
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0')
                    count++;
                else
                    str += s.charAt(i);
            }
            
            
            s = Integer.toBinaryString(str.length());
        }
        
        int[] answer = {check, count};

        return answer;
    }
}