import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int work : works) {
            maxHeap.add(work);
        }
        
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = maxHeap.poll();
            if (num == 0) {
                break;
            }
            num -= 1;
            maxHeap.add(num);
        }
        
        long answer = 0;
        for (int i : maxHeap) {
            answer += (i * i);
        }
        return answer;
    }
}