class Solution {
    public int solution(String s) {
        
        int num = 1000;
        int i = 1;
        while(s.length() / i > 0) {
            num = Math.min(num, check(s, i));
            i++;
        }    
        return num;
    }
    
    public int check(String s, int i) {
        String result = "";
        String check  = s.substring(0,i);
        int count = 1;
        
        s = s.substring(i);
        
        while(s.length() >= i) {
            
            if(check.equals(s.substring(0,i))) {
                count++;
                s = s.substring(i);
            }
            else {
                result += check;
                if(count >= 2)
                    result += String.valueOf(count);
                count = 1;
                check = s.substring(0,i);
                s = s.substring(i);
            }
        }
        
        result += check;
        if(count >= 2)
            result += String.valueOf(count);
        result += s;
        
        return result.length();
    }
    
    
}