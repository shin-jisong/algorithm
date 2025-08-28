import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> cloth = new HashMap<>();
        for(String[] c: clothes) {
            String k = c[1];
            String v = c[0];
            
            if (cloth.containsKey(k)) {
                cloth.put(k, cloth.get(k) + 1);
            } else {
                cloth.put(k, 1);
            }
        }
        
        System.out.println(cloth);
        int answer = 1;
        for (int value : cloth.values()) {
            answer *= (value + 1);
        }
        
        
        return answer - 1;
    }
}