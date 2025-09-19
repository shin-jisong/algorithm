import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int h;
        int answer = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            h = citations.length - i;
            if (citations[i] >= h) answer = h;
            else break;
        }
        
        return answer;
    }
}