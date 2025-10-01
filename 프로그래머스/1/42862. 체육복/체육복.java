import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        List<Integer> losts = new ArrayList<>();
        List<Integer> reserves = new ArrayList<>();
        List<Integer> needToRemove = new ArrayList<>();
        
        for (int l: lost) losts.add(l);
        for (int r: reserve) reserves.add(r);
        
        for (int l : losts) {
            if (reserves.contains(l)) {
                needToRemove.add(l);
            }
        }
        
        for (int t: needToRemove) {
            losts.remove(Integer.valueOf(t));
            reserves.remove(Integer.valueOf(t));
        }
        
        
        int answer = n;
        
        while (losts.size() > 0 && reserves.size() > 0) {
            if (losts.get(0) - 1 > reserves.get(0)) {
                reserves.remove(0);
            } else if (losts.get(0) + 1 < reserves.get(0)) {
                answer -= 1;
                losts.remove(0);
            } else if (losts.get(0) - 1 == reserves.get(0) || losts.get(0) + 1 == reserves.get(0)) {
                reserves.remove(0);
                losts.remove(0);
            }
        }
        
        answer -= losts.size();
        return answer;
    }
}