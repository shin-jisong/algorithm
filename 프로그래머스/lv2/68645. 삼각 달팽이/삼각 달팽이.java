import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        int count = count(n);
        int arr[][] = triangle(n, count);
        
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < i+1; j++) {
                answer.add(arr[i][j]);
        	}
        }
        return answer;
    }
    
    public static int[][] triangle(int n, int count) {
        int[][] arr = new int[n][n];
        int i = 0; int j = 0; int checkCount = 1;
        
        int dirX = 1; int dirY  = 0;
        int checkX = n-1; int checkY = n-1;
        
        while(checkCount != count+1) {
            arr[i][j] = checkCount;
            checkCount++;
            
            if(dirX == 1 && dirY == 0) {
                if(i == checkX) {
                    checkX--;
                    dirX = 0;
                    dirY = 1;
                }
            }
            else if(dirX == 0 && dirY == 1) {
                if(j == checkY) {
                    checkY-=2;
                    dirX = -1;
                    dirY = -1;
                }
            }
            else if(dirX == -1 && dirY == -1) {
                if(arr[i+dirX][j+dirY] != 0) {
                    dirX = 1;
                    dirY = 0;
                }     
            }
            
            i += dirX;
            j += dirY;
        }
        
        return arr;
    }
    
    public static int count(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        
        return sum;
    }
}