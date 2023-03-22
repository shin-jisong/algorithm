class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 10;
        int right = 12;
        int leftLength = 0;
        int rightLength = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            
            if(numbers[i] == 0)
                numbers[i] = 11;
            
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                left = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                right = numbers[i];
            }
            else {
                leftLength = Math.abs(left - numbers[i]) / 3 + Math.abs(left - numbers[i]) % 3;
                rightLength = Math.abs(right - numbers[i]) / 3 + Math.abs(right - numbers[i]) % 3;
                
                if(leftLength > rightLength) {
                    answer += "R";
                    right = numbers[i];
                }
                else if(leftLength < rightLength) {
                    answer += "L";
                    left = numbers[i];
                }
                else {
                    if(hand.equals("right")) {
                        answer += "R";
                        right = numbers[i];
                    }
                    else {
                        answer += "L";
                        left = numbers[i];
                    }
                }
            }
            
        }
        
        return answer;
    }
}