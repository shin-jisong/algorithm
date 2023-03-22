import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<Integer>();
        
        String[] todayArr = today.split("\\.");
        HashMap<String, Integer> termsArr = new HashMap<>();
        
        for(int i = 0; i < terms.length; i++) {
            String[] termsParsing = terms[i].split(" ");
            termsArr.put(termsParsing[0], Integer.parseInt(termsParsing[1]));
        }
        
        for(int i = 0; i < privacies.length; i++) {
            String[] privaciesParsing = privacies[i].split(" ");
            String[] date = privaciesParsing[0].split("\\.");
            
            if(checkDate(todayArr, date) >= termsArr.get(privaciesParsing[1]))
                answer.add(i+1);
        }
        
        return answer;
    }
    
    public static float checkDate(String[] today, String[] privacies) {
        int todayDate = (Integer.parseInt(today[0]) * 12 * 28) + (Integer.parseInt(today[1]) * 28) + Integer.parseInt(today[2]);
        int privaciesDate = (Integer.parseInt(privacies[0]) * 12 * 28) + (Integer.parseInt(privacies[1]) * 28) + Integer.parseInt(privacies[2]);
        
        return (todayDate - privaciesDate) / 28;
    }
}