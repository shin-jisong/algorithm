import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] number = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < number.length; i++) {
            int num = Integer.parseInt(number[i]);
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }
                                       
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}