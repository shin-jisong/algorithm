import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int s: scoville) {
            heap.add(s);
        }
        
        int answer = 0;
        while (true) {
            if (heap.size() <= 1 && heap.peek() < K) {
                answer = -1;
                break;
            }
            
            if (heap.peek() >= K) {
                break;
            }
            
            int first = heap.poll();
            int second = heap.poll();
            heap.add(first + second * 2);
            answer += 1;
        }
        
        return answer;
    }
}