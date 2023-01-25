import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int[] road, city, roadCheck;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());
		n = n - 1;
		
		road = new int[n];
		city = new int[n];
		roadCheck = new int[n];
		int res = 1000000000;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
			road[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
			city[i] = Integer.parseInt(st.nextToken());
		
		roadCheck[n-1] = road[n-1];
		for(int i = n-2; i >= 0; i--)
			roadCheck[i] = road[i] + roadCheck[i+1];
		
		for(int i = 0; i < n; i++) {
			res = Math.min(res, check(i));
		}
		
		System.out.print(res);
		
	}
	
	public static int check(int num) {
		int count = 0;
		count += city[num] * roadCheck[num];
		
		
		for(int i = num-1; i >= 0; i--)
			count += city[i] * (roadCheck[i] - roadCheck[i+1]);
		
		return count;
	}

}