import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] check = new int[n][n];
        int answer = 0;
        
        check[0][0] = triangle[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                     check[i][j] = triangle[i][j] + check[i-1][j];
                } else if (j == i) {
                     check[i][j] = triangle[i][j] + check[i-1][j-1];
                } else {
                     check[i][j] = triangle[i][j] + Math.max(check[i-1][j], check[i-1][j-1]);
                }
                if (i == n - 1) answer = Math.max(answer, check[i][j]);
            }
            
        }
    
        return answer;
    }
}