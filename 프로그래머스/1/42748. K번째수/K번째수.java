import java.util.*;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int[] c : commands) {
            int[] temp = Arrays.copyOfRange(array, c[0]-1, c[1]);
            Arrays.sort(temp); 
            answer.add(temp[c[2] - 1]);
        }
        return answer;
    }
}