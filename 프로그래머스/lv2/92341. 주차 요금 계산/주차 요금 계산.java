import java.util.*;

class Solution {
    public List<Integer> solution(int[] fees, String[] records) {
        
        HashMap<String,String> checkTime = new HashMap<String,String>();
        HashMap<String,Integer> checkMoney = new HashMap<String,Integer>();
        
        for(int i = 0; i < records.length; i++) {
            String[] recordslist = records[i].split(" ");
            
            if(recordslist[2].equals("IN")) {
                checkTime.put(recordslist[1], recordslist[0]);
                if(!checkMoney.containsKey(recordslist[1]))
                    checkMoney.put(recordslist[1], 0);
            }
            else {
                String inTime = checkTime.get(recordslist[1]);
                checkTime.remove(recordslist[1]);
                
                String outTime = recordslist[0];
                
                String[] inTimelist = inTime.split(":");
                Integer inTimeHour = Integer.parseInt(inTimelist[0]);
                Integer inTimeMinute = Integer.parseInt(inTimelist[1]);
                
                String[] outTimelist = outTime.split(":");
                Integer outTimeHour = Integer.parseInt(outTimelist[0]);
                Integer outTimeMinute = Integer.parseInt(outTimelist[1]);
                
                int chargeTime = (outTimeHour * 60 + outTimeMinute) - (inTimeHour * 60 + inTimeMinute);
                
                checkMoney.put(recordslist[1], checkMoney.get(recordslist[1]) + chargeTime);
                
                
            }
            
            
        }
        
        for(String i : checkTime.keySet()){ 
            
            String inTime = checkTime.get(i);
            
            String[] inTimelist = inTime.split(":");
            Integer inTimeHour = Integer.parseInt(inTimelist[0]);
            Integer inTimeMinute = Integer.parseInt(inTimelist[1]);

            Integer outTimeHour = 23;
            Integer outTimeMinute = 59;
                
            int chargeTime = (outTimeHour * 60 + outTimeMinute) - (inTimeHour * 60 + inTimeMinute);
            
            checkMoney.put(i, checkMoney.get(i) + chargeTime);
        }
        
        for(String i : checkMoney.keySet()){ 
            
            checkMoney.put(i, moneyCheck(fees, checkMoney.get(i)));
        }
        
        Map<String, Integer> sortedCheckMoney = new TreeMap<>(checkMoney);
        List<Integer> answer = new ArrayList<>(sortedCheckMoney.values());
        
        return answer;
    }
    
    public int moneyCheck(int[] fees, int chargeTime) {
        
        
        if(chargeTime <= fees[0])
            return fees[1];
        else {
            int sum = fees[1];
            chargeTime -= fees[0];
            if(chargeTime % fees[2] == 0)
                sum += chargeTime / fees[2] * fees[3];
            else
                sum += (chargeTime / fees[2] * fees[3]) + fees[3];
            
            return sum;
        }
    }
}