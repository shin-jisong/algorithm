import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		System.out.print(check(n, m));

	}
	
	public static BigInteger check(int n, int m) {
		
		BigInteger num = new BigInteger("1");
		int count = n;
		
		for(int i = 1; i <= m; i++) {
			num = num.multiply(BigInteger.valueOf(count)).divide(BigInteger.valueOf(i));
			count--;

		}
		
		return num;
	}
	

}
