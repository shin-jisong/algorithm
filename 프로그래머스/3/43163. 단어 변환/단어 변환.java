import java.util.*;

class Solution {
    int answer = 0;
    
    public Boolean oneDifferentWord(String word1, String word2) {
        int check = 0;
        for(int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                check += 1;
            }
        }
        if (check == 1) return true;
        else return false;
    }
    
    public void dfs(String word, String target, String[] words, int count, List<Boolean> visited) {
        if (word.equals(target)) {
            if (answer == 0) answer = count;
            else if (answer > count) answer = count;
            return;
        } else if (answer != 0 && count > answer) return;
        
        for (int i = 0; i < words.length; i++) {
            if (oneDifferentWord(words[i], word) && !visited.get(i)) {
                visited.set(i, true);
                dfs(words[i], target, words, count + 1, visited);
                visited.set(i, false);
            }
        }
    }
    public int solution(String begin, String target, String[] words) {
        List<Boolean> visited = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            visited.add(false);
        }
        
        dfs(begin, target, words, 0, visited);
        return answer;
    }
}