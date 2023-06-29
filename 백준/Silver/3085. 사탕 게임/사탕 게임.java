import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static char[][] arr;
	public static int[][] num;
	public static int check;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = null;
		check = 0;
		int max = 0;
		
		try {
			check = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		arr = new char[check][check];
		num = new int[check][check];

		for(int i = 0; i < check; i++) {
			
			try {
				st = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int j = 0; j < check; j++) {
				arr[i][j] = st.charAt(j);
			}
		}
		
		
		for(int i = 0; i < check; i++) {
			for(int j = 0; j < check; j++) {
				if (j > 0) {
					ex(i, j, i, j-1);
					num[i][j] = Math.max(num[i][j], horiz(i, j));
					num[i][j] = Math.max(num[i][j], verti(i, j));
					ex(i, j, i, j-1);
				}
				
				if (j < check-1) {
					ex(i, j, i, j+1);
					num[i][j] = Math.max(num[i][j], horiz(i, j));
					num[i][j] = Math.max(num[i][j], verti(i, j));
					ex(i, j, i, j+1);
				}
				
				if (i > 0) {
					ex(i, j, i-1, j);
					num[i][j] = Math.max(num[i][j], horiz(i, j));
					num[i][j] = Math.max(num[i][j], verti(i, j));
					ex(i, j, i-1, j);
				}
				
				if (i < check-1) {
					ex(i, j, i+1, j);
					num[i][j] = Math.max(num[i][j], horiz(i, j));
					num[i][j] = Math.max(num[i][j], verti(i, j));
					ex(i, j, i+1, j);
					
				}
			}
		}
		
		
		for(int i = 0; i < check; i++) {
			for(int j = 0; j < check; j++) {
				max = Math.max(num[i][j], max);
			}
		}

		System.out.print(max);
	}
	
	public static void ex(int a1, int b1, int a2, int b2) {
		char temp;
		temp = arr[a1][b1];
		arr[a1][b1] = arr[a2][b2];
		arr[a2][b2] = temp;

	}
	public static int horiz(int a, int b) {
		
		int num;
		int max = 0;
		char temp = arr[a][b];
		
		for(int i = 0; i < check; i++) {
			num = 0;
			for(int j = 0; j < check; j++) {
				if(temp != arr[i][j]) {
					max = Math.max(max, num);
					num = 0;
					continue;
				}
				num++;
			}
			max = Math.max(max, num);
		}
		
		return max;
	}
	
	public static int verti(int a, int b) {
		int num;
		int max = 0;
		char temp = arr[a][b];
		
		for(int i = 0; i < check; i++) {
			num = 0;
			for(int j = 0; j < check; j++) {
				if(temp != arr[j][i]) {
					max = Math.max(max, num);
					num = 0;
					continue;
				}
				num++;
			}
			max = Math.max(max, num);
		}
		
		return max;
	}

}