import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int n;
	public static StringBuilder sb;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		sb = new StringBuilder();
		
		for(int i = 2; i < 10; i++) {
			createPrime(Integer.toString(i));
		}
		System.out.print(sb);

	}
	
	public static void createPrime(String s) {
	
		
		if(s.length() == n) {
			if(checkPrime(Integer.parseInt(s)))
				sb.append(s + "\n");
			return;
		}
		else {
			if(!checkPrime(Integer.parseInt(s)))
				return;
		}
		
		for(int i = 1; i < 10; i++) {
			String temps = s + Integer.toString(i);
			createPrime(temps);
		}
			
	}
	
	public static boolean checkPrime(int x) {
		for(int i = 2; i < (int)(Math.sqrt(x)) + 1; i++) {
			if(x % i == 0)
				return false;

		}
		
		return true;
			
	}

}
