import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        
       if(Character.isDigit(s.charAt(0)))
           answer += s.charAt(0);
        else
            answer += Character.toUpperCase(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)) || s.charAt(i) == ' ')
               answer += s.charAt(i);
            else {
                if(s.charAt(i-1) ==' ')
                    answer += Character.toUpperCase(s.charAt(i));
                else
                    answer += Character.toLowerCase(s.charAt(i));
                    
            }
                
        }
        return answer;
    }
}