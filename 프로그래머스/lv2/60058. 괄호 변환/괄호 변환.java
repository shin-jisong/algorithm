class Solution {
    public String solution(String p) {
        return checkString(p);
    }
    
    public String checkString(String p) {
        if(p == "")
            return "";
        
        if(right(p))
            return p;
        
        String u = "";
        String v = "";
        
        
        for(int j = 1; j < p.length()+1; j++) {
            u = p.substring(0, j);
            v = p.substring(j);
            if(check(u) && check(v))
                break;
        }
        
        System.out.printf("u:%s v:%s\n", u, v);
     
        if(right(u)) {
            return u + checkString(v);
        }
        else {
            String check = "(" + checkString(v) + ")";
            for(int j = 1; j < u.length()-1; j++) {
                if(u.charAt(j) == '(')
                    check += ")";
                else
                    check += "(";
                
            }
            
            return check;
            
        }
    }
    
    public boolean check(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(')
                sum++;
            else
                sum--;
        }
        
        if(sum == 0)
            return true;
        else
            return false;
            
    }
    
     public boolean right(String str) {
        int sum = 0;
        int check = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(')
                sum++;
            else
                sum--;
            
            if(sum < 0) {
                check = 1;
                break;
            }
        }
        
        if(check == 0)
            return true;
        else
            return false;
            
    }
}