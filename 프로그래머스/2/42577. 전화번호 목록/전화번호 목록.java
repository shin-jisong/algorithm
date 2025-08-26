import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        HashSet<String> phone = new HashSet<>();
        for(String p : phone_book) {
            for(int i = 1; i < p.length() + 1; i++) {
                if (phone.contains(p.substring(0, i))) return false;
            } 
            phone.add(p);
        }
        return true;
    }
}