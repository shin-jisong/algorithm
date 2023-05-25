import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		int count = n;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j) {
					if(str[i].length() < str[j].length()) {
						if(str[i].equals(str[j].substring(0, str[i].length()))) {
							count--;
						
							break;
						}
					}
					
					if(str[i].equals(str[j])) {
						if(j > i) {
							count--;
							break;
						}
						
					}
				}
			}
		}
		
		System.out.println(count);

	}

}