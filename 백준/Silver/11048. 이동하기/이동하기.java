import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		int[][] check = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		check[0][0] = arr[0][0];
		
		for(int i = 1; i < n; i++)
			check[i][0] = check[i-1][0] + arr[i][0];
		
		for(int j = 1; j < m; j++)
			check[0][j] = check[0][j-1] + arr[0][j];
		
		int num = 0;
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < m; j++) {
				num = Math.max(check[i][j-1], check[i-1][j]);
				check[i][j] = arr[i][j] + Math.max(check[i-1][j-1], num);
			}
		}
		
		
		System.out.print(check[n-1][m-1]);

	}

}