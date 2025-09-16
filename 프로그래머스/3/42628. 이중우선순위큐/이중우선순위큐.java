import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0]) 
        );

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0]) 
        );
        HashSet<Integer> valid = new HashSet<>();
        int idx = 0;
        
        for(String s: operations) {
            if(s.startsWith("I")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                minHeap.add(new int[]{num, idx});
                maxHeap.add(new int[]{num, idx});
                valid.add(idx);
                idx += 1;
            } else if (s.equals("D 1")) {
                while (valid.size() > 0) {
                    int[] item = maxHeap.poll();
                    if (valid.contains(item[1])) {
                        maxHeap.remove(item[1]);
                        valid.remove(item[1]);
                        break;
                    }
                }
            } else if (s.equals("D -1")) {
                while (valid.size() > 0) {
                    int[] item = minHeap.poll();
                    if (valid.contains(item[1])) {
                        minHeap.remove(item[1]);
                        valid.remove(item[1]);
                        break;
                    }
                }
            }
        }
        
        if (valid.size() == 0) return new int[] {0, 0};
        
        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;
        while (valid.size() > 0) {
            int[] item = minHeap.poll();
            if (valid.contains(item[1])) {
                min_value = item[0];
                max_value = item[0];
                break;
            }
        }
        
        while (valid.size() > 0) {
            int[] item = maxHeap.poll();
            if (valid.contains(item[1])) {
                if (item[1] > max_value) max_value = item[0];
                break;
            }
        }
        return new int[]{max_value, min_value};
    }
}