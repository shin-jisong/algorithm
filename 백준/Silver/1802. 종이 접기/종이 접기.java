import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static boolean res;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			
			String str = br.readLine();
			res = true;
			check(str);
			
			if(res)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}

	}
	
	public static void check(String str) {
		
		int num = str.length() / 2;
		
		if(num == 0)
			return;
		
		String str1 = str.substring(0, num);
		String str2 = str.substring(num+1);
		
		
		StringBuffer sb = new StringBuffer(str2);
	    
	    
	   
	    for(int i = 0; i < sb.length(); i++) {
	    	if(sb.charAt(i) == '0')
	    		sb.setCharAt(i, '1');
	    	else
	    		sb.setCharAt(i, '0');
	    }
	    
	    String str2reverse = sb.reverse().toString();
	    
		if(str1.equals(str2reverse)) {
			
			check(str1);
			check(str2);
		}
		else {
			res = false;
			return;
		}
		
		
	}

}