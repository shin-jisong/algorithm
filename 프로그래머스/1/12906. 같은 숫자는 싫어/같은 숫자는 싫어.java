import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int a : arr) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != a) {
                ans.add(a);
            }
        }

        return ans;
    }
}