import java.util.*;

class Solution {
    int count = 0;
    int answer = 0;
    
    public void check(String nowWord, String word) {
        if (word.equals(nowWord)) {
            answer = count;
            return;
        } 
        
        if (nowWord.length() >= 5) return;
        
        String[] alpha = {"A", "E", "I", "O", "U"};
        for (String a: alpha) {
            count += 1;
            check(nowWord + a, word);
        }
    }
    
    public int solution(String word) {
        check("", word);
        return answer;
    }
}