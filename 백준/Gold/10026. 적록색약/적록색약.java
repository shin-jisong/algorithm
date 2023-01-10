import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = null;
		
		int[][] pic = new int[n][n];
		boolean[][] visitOne = new boolean[n][n];
		boolean[][] visitTwo = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			for(int j = 0; j < n; j++) {
				if(str.charAt(j) == 'R')
					pic[i][j] = 1;
				else if(str.charAt(j) == 'G')
					pic[i][j] = 2;
				else if(str.charAt(j) == 'B')
					pic[i][j] = 3;
			}
		}
		
		int countOne = 0;
		int countTwo = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visitOne[i][j]) {
					countOne++;
					checkOne(pic, visitOne, n, i, j);
				}
				if(!visitTwo[i][j]) {
					countTwo++;
					checkTwo(pic, visitTwo, n, i, j);
				}
			}
		}
		
		System.out.printf("%d %d", countOne, countTwo);
		
		
				
	}
	
	static void checkOne(int[][] arr, boolean[][] visited, int n, int x, int y) {
		visited[x][y] = true;
		
		if(x+1 < n && arr[x][y] == arr[x+1][y] && !visited[x+1][y])
			checkOne(arr, visited, n, x+1, y);
		
		if(x-1 >= 0 && arr[x][y] == arr[x-1][y] && !visited[x-1][y])
			checkOne(arr, visited, n, x-1, y);
		
		if(y-1 >= 0 && arr[x][y-1] == arr[x][y] && !visited[x][y-1])
			checkOne(arr, visited, n, x, y-1);
		
		if(y+1 < n && arr[x][y] == arr[x][y+1] && !visited[x][y+1])
			checkOne(arr, visited, n, x, y+1);
		
		
	}
	
	static void checkTwo(int[][] arr, boolean[][] visited, int n, int x, int y) {
		visited[x][y] = true;
		
		if(arr[x][y] == 3) {
			if(x+1 < n && arr[x+1][y] == 3 && !visited[x+1][y])
				checkTwo(arr, visited, n, x+1, y);
			
			if(x-1 >= 0 && arr[x-1][y] == 3 && !visited[x-1][y])
				checkTwo(arr, visited, n, x-1, y);
			
			if(y-1 >= 0 && arr[x][y-1] == 3 && !visited[x][y-1])
				checkTwo(arr, visited, n, x, y-1);
			
			if(y+1 < n && arr[x][y+1] == 3 && !visited[x][y+1])
				checkTwo(arr, visited, n, x, y+1);
		}
		else if (arr[x][y] != 3) {
			if(x+1 < n && arr[x+1][y] != 3 && !visited[x+1][y])
				checkTwo(arr, visited, n, x+1, y);
			
			if(x-1 >= 0 && arr[x-1][y] != 3 && !visited[x-1][y])
				checkTwo(arr, visited, n, x-1, y);
			
			if(y-1 >= 0 && arr[x][y-1] != 3 && !visited[x][y-1])
				checkTwo(arr, visited, n, x, y-1);
			
			if(y+1 < n && arr[x][y+1] != 3 && !visited[x][y+1])
				checkTwo(arr, visited, n, x, y+1);
		}
		
	}

}