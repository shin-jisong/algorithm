import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[] color = new int[2];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		check(arr, 0, n, 0, n);
		
		System.out.print(color[0] + "\n" + color[1]);

	}
	
	public static void check(int[][] li, int x1, int x2, int y1, int y2) {
		
		int num = 0;
		int colorCheck = li[x1][y1];
		
		for(int i = x1; i < x2; i++) {
			for(int j = y1; j < y2; j++) {
				if(colorCheck != li[i][j]) {
					num = 1;
					break;
				}
			}
		}
		
		if(num == 0)
			color[colorCheck]++;
		else {
			int midx = (x1 + x2) / 2;
			int midy = (y1 + y2) / 2;
			check(li, x1, midx, y1, midy);
			check(li, x1, midx, midy, y2);
			check(li, midx, x2, y1, midy);
			check(li, midx, x2, midy, y2);
		}
		
	}

}