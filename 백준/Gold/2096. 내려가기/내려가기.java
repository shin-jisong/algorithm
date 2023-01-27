import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int[][] maxArr, minArr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());
		
		maxArr = new int[2][3];
		minArr = new int[2][3];
		
		int x1, x2, x3;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			x1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			x3 = Integer.parseInt(st.nextToken());
			
			if(i == 0) {
				minArr[0][0] = maxArr[0][0] = x1;
				minArr[0][1] = maxArr[0][1] = x2;
				minArr[0][2] = maxArr[0][2] = x3;
				
			}
			else {
				minArr[i % 2][0] = Math.min(minArr[(i+1) % 2][0], minArr[(i+1) % 2][1]) + x1;
				minArr[i % 2][1] = Math.min(minArr[(i+1) % 2][0], Math.min(minArr[(i+1) % 2][1], minArr[(i+1) % 2][2])) + x2;
				minArr[i % 2][2] = Math.min(minArr[(i+1) % 2][1], minArr[(i+1) % 2][2]) + x3;
				
				maxArr[i % 2][0] = Math.max(maxArr[(i+1) % 2][0], maxArr[(i+1) % 2][1]) + x1;
				maxArr[i % 2][1] = Math.max(maxArr[(i+1) % 2][0], Math.max(maxArr[(i+1) % 2][1], maxArr[(i+1) % 2][2])) + x2;
				maxArr[i % 2][2] = Math.max(maxArr[(i+1) % 2][1], maxArr[(i+1) % 2][2]) + x3;
				
			}
			
		}
		
		 
		
		int x = (n+1) % 2;
		
		System.out.printf("%d %d", Math.max(maxArr[x][0], Math.max(maxArr[x][1], maxArr[x][2])), Math.min(minArr[x][0], Math.min(minArr[x][1], minArr[x][2])));

	}

	

}