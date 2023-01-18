import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int check[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(n > 0)
			sb.append("0 ");
		
		for(int i = 1; i < n; i++) {
			if(arr[i-1] >= arr[i])
				check[i] = i;
			else
				app(n, arr, check, i, i);
				
			sb.append(check[i] + " ");
		}
		
		System.out.print(sb);

	}
	
	public static void app(int n, int[] arr, int[] check, int a, int b) {
		
		if(b < 1)
			check[a] = 0;
		else if(arr[b-1] >= arr[a])
			check[a] = b;
		else
			app(n, arr, check, a, check[b-1]);
		
	}

}
