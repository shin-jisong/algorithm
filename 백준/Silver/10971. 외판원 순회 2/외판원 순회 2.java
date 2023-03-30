import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static int n;
	public static int[][] city;
	public static int min;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		city = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < n; j++) {
				city[i][j] = Integer.parseInt(st.nextToken());
			}
			
			
		}
		
		min = -1;
		Stack<Integer> stack = new Stack<>();
		
		check(stack, 0);
		
		System.out.print(min);
		
		

	}
	
	public static void check(Stack<Integer> stack, int num) {
		
		
		if(stack.size() == n) {
			if(city[stack.lastElement()][stack.firstElement()] == 0)
				return;
			
			num += city[stack.lastElement()][stack.firstElement()];
			if(min == -1)
				min = num;
			else
				min = Math.min(min, num);
			
			return;
		}
		else if(stack.size() < n){
			for (int i = 0; i < n; i++) {
				
				if(stack.isEmpty()) {
					stack.push(i);
					check(stack, num);
					stack.pop();
				}
				else if(stack.search(i) == -1) {
					int lastNum = stack.lastElement();
					if(city[lastNum][i] == 0)
						continue;
					stack.push(i);
					check(stack, num + city[lastNum][i]);
					stack.pop();
				}
				
				
			}
		}
	}

}