import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        ArrayList<Integer> p = new ArrayList<>();
        for (int priority : priorities) {
            p.add(priority); 
        }
        
        int answer = 0;
        while(p.size() != 0) {
            int m = Collections.max(p);
            if(m == p.get(location) && location == 0) {
                answer += 1;
                break;
            } else if(m == p.get(0)) {
                answer += 1;
                p.remove(0);
                location -= 1;
            } else if(m != p.get(0)) {
                if (location == 0) {
                    location = p.size() - 1;
                } else {
                    location -= 1;
                }
                p.add(p.remove(0));
            }
        }
        return answer;
    }
}