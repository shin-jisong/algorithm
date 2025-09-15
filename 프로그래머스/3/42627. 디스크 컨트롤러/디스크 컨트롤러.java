import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));
        int answer = 0;
        int n = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);   
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);  
            return Integer.compare(a[2], b[2]);                    
        });
        int time = 0;
        
        while (n < jobs.length || pq.size() != 0) {
            while (true) {
                if (jobs.length > n && time >= jobs[n][0]) {
                    pq.add(new int[]{jobs[n][1], jobs[n][0], n});
                    n += 1;
                } else break;
            }
            
            if (pq.size() == 0) {
                time += 1;
                continue;
            }
            
            int[] item = pq.poll();
            time += (item[0]);
            answer += (time - item[1]);
        }
        return answer / jobs.length;
    }
}