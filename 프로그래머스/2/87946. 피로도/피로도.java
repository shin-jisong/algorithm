import java.util.*;

class Solution {
    int answer = -1;
    
    public void check(int k, int[][] dungeons, List<Boolean> visited, int count) {
        if (count > answer) answer = count;
        for (int i = 0; i < visited.size(); i++) {
            if (!visited.get(i) && dungeons[i][0] <= k) {
                visited.set(i, true);
                check(k - dungeons[i][1], dungeons, visited, count + 1);
                visited.set(i, false);
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        List<Boolean> visited = new ArrayList<>();
        for (int i = 0; i < dungeons.length; i++) {
            visited.add(false);
        }
        
        check(k, dungeons, visited, 0);
        return answer;
    }
}