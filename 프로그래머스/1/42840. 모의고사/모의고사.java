import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] one = new int[]{1, 2, 3, 4, 5};
        int[] two = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> check = new ArrayList<>(Arrays.asList(0, 0, 0));
        
        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) check.set(0, check.get(0) + 1);
            if (answers[i] == two[i % two.length]) check.set(1, check.get(1) + 1);
            if (answers[i] == three[i % three.length]) check.set(2, check.get(2) + 1);
        }
        
        int max_check = Collections.max(check);
        for (int i = 0; i < check.size(); i++) {
            if (check.get(i) == max_check) answer.add(i + 1);
        }
        return answer;
    }
}