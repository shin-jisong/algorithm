import java.util.*;

class Solution {
    
    public boolean[][] node;
    public boolean[] visit;
    public int[] len;
    public Queue<Integer> queue = new LinkedList<>();
    public int count = 0;
    
    public int solution(int n, int[][] edge) {
        
        node = new boolean[n+1][n+1];
        visit = new boolean[n+1];
        len = new int[n+1];
        
        for(int i = 0; i < edge.length; i++) {
            node[edge[i][0]][edge[i][1]] = true;
            node[edge[i][1]][edge[i][0]] = true;
        }
        
        queue.add(1);
        visit[1] = true;
        count++;
        check(n);
        
        int res = 0;
        for(int i = 1; i < n+1; i++) {
            if(len[i] == count) {
                res++;
            }
        }
        
        return res;
    }
    
    public void check(int n) {
        int checkNum = queue.size();
    
        for(int i = 0; i < checkNum; i++) {
            int num = queue.poll();
            
            for(int j = 1; j < n+1; j++) {
                if(node[num][j] && !visit[j]) {
                    queue.add(j);
                    len[j] = count;
                    visit[j] = true;
                }
            }
        }
        
        
        for(int i = 1; i < n+1; i++) {
            if(!visit[i]) {
                count++;
                check(n);
            }
        }
        
    }
}