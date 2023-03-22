class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        long sum1 = 0;
        long sum2 = 0;
        long result = 0;
        int check = 0;
        
        for(int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
        }
        
        result = (sum1 + sum2) / 2;
        
        if(sum1 < sum2) {
            for(int i = 0; i < queue2.length; i++) {
                
                answer += 1;
                sum1 += queue2[i];
                
                while(sum1 > result && check < queue1.length * 2) {
                    if(check < queue1.length)
                        sum1 -= queue1[check];
                    else
                        sum1 -= queue2[check - queue1.length];
                        
                    check += 1;
                    answer += 1;
                }
                
                if(sum1 == result)
                    return answer;
            }
            
            answer = -1;
        }
        else if (sum1 > sum2) {
            
             for(int i = 0; i < queue2.length; i++) {
                
                answer += 1;
                sum2 += queue1[i];
                
                while(sum2 > result && check < queue2.length * 2) {
                    if(check < queue2.length)
                        sum2 -= queue2[check];
                    else
                        sum2 -= queue1[check - queue1.length];
                        
                    check += 1;
                    answer += 1;
                }
                
                if(sum2 == result)
                    return answer;
            }
            
            answer = -1;
            
        }
        else {
            answer = 0;
        }
        
        return answer;
    }
}