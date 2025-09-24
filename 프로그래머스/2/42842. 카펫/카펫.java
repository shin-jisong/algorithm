import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int check = (brown - 4) / 2;
        for(int i = 1; i < check / 2 + 1; i++) {
            if (i * (check - i) == yellow) {
                answer[0] = check - i + 2;
                answer[1] = i + 2;
                break;
            }
        }
        return answer;
    }
}