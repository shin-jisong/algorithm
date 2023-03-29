import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int check1 = n / 5;
		int check2 = (n - check1 * 5) / 3;
		
		while(check1 >= 0) {
			if(check1 * 5 + check2 * 3 == n) {
				System.out.print(check1 + check2);
				return;
			}

			
			check1--;
			check2 = (n - check1 * 5) / 3;
		}
		
		System.out.print(-1);

	}

}