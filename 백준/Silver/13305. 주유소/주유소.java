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
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
			road[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
			city[i] = Integer.parseInt(st.nextToken());
		
		int min = city[0];
		int res = 0;
		
		for(int i = 0; i < n; i++) {
			if(city[i] < min)
				min = city[i];
			
			res += (min * road[i]);
		}
		
		System.out.print(res);
		
	}

}
