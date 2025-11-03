import java.util.*;

class Solution {
    int answer = 0;
    HashMap<Integer, List<Integer>> tree = new HashMap<>();
    
    public void dfs(int node, int sheep, int wolf, List<Integer> nextNode, int[] info) {
        if (info[node] == 0) sheep += 1;
        else wolf += 1;
        
        if (sheep <= wolf) return;
        
        answer = Math.max(answer, sheep);
        
        if (tree.containsKey(node)) {
            nextNode.addAll(tree.get(node));
        }
        
        for (Integer nxt : nextNode) {
            List<Integer> nxtNode = new ArrayList<>(nextNode);
            nxtNode.remove(nxt);
            dfs(nxt, sheep, wolf, nxtNode, info);
        }
    }
    
    public int solution(int[] info, int[][] edges) {
        for (int[] e : edges) {
            if (!tree.containsKey(e[0])) {
                tree.put(e[0], new ArrayList<>());
            }
            tree.get(e[0]).add(e[1]);
        }
        List<Integer> nextNode = new ArrayList<>();
        dfs(0, 0, 0, nextNode, info);
        return answer;
    }
}