import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int rows, int columns, int[][] queries) {
         ArrayList<Integer> answer = new ArrayList<Integer>();
        
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = i*columns + j + 1;
            }
        }
        
        
        for(int i = 0; i < queries.length; i++) {
            int rowStart = queries[i][0] - 1;
            int colStart = queries[i][1] - 1;
            int rowEnd = queries[i][2] - 1;
            int colEnd = queries[i][3] - 1;
            
            int rowIdx = rowStart;
            int colIdx = colStart;
            
            int temp = matrix[rowIdx][colIdx];
            int min = matrix[rowIdx][colIdx];
            int checkNum = 0;
    
            do {
                
                
                
                if(rowIdx == rowStart && colIdx < colEnd) 
                    colIdx++;
                else if(rowIdx < rowEnd && colIdx == colEnd) 
                    rowIdx++;
                else if(rowIdx == rowEnd && colIdx > colStart) 
                    colIdx--;
                else if(rowIdx > rowStart && colIdx == colStart)
                    rowIdx--;
                
                
                checkNum = matrix[rowIdx][colIdx];
                matrix[rowIdx][colIdx] = temp;
                temp = checkNum;
                
                if(temp < min)
                    min = temp;
                
            } while(rowIdx != rowStart || colIdx != colStart);
        
        
            answer.add(min);
        }
        
        
        return answer;
    }
    
}