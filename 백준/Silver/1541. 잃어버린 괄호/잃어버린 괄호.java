import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String temp = "";
		int count = 0;
		boolean ctr = false;
		
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != '+' && str.charAt(i) != '-') {
				temp += str.charAt(i);
			}
			else {
				
				
				if(ctr)
					count -= Integer.parseInt(temp);
				else
					count += Integer.parseInt(temp);
				
				temp = "";
				if(str.charAt(i) == '-')
					ctr = true;
			}
		}
		
		if(ctr)
			count -= Integer.parseInt(temp);
		else
			count += Integer.parseInt(temp);
		
		System.out.print(count);
		
	}

}