import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        List<Integer> bridge = new ArrayList<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        
        List<Integer> tw = new ArrayList<>();
        for (int i = 0; i < truck_weights.length; i++) {
            tw.add(truck_weights[i]);
        }
        
        int sb = 0;
        while(tw.size() != 0 || sb != 0) {
            answer += 1;
            if (tw.size() == 0) {
                sb -= bridge.remove(0);
                bridge.add(0);
            } else if (sb - bridge.get(0) + tw.get(0) <= weight) {
                sb -= bridge.remove(0);
                sb += tw.get(0);
                bridge.add(tw.remove(0));
            } else {
                sb -= bridge.remove(0);
                bridge.add(0);
            }
        }
        
        return answer;
    }
}