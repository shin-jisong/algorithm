import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static int n;
	public static int num[];
	public static boolean visit[];
	public static String check ="";
	
	public static int min, max;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		num = new int[n];
		for(int i = 0; i < n; i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int temp = 0;
		
		for(int i = 0; i < 4; i++) {
			temp = Integer.parseInt(st.nextToken());
			for(int j = 0; j < temp; j++) {
				if(i == 0)
					check += "+";
				else if(i == 1)
					check += "-";
				else if (i == 2)
					check += "x";
				else if (i == 3)
					check += "%";
				
			}
		}
		
		visit = new boolean[check.length()];
		
		min = +1000000000;
		max = -1000000000;
		
		Stack<Character> stack = new Stack<>();
		result(stack);
		System.out.printf("%d\n%d", max, min);

	}
	
	public static void result(Stack<Character> stack) {
	
		
		if(stack.size() == n - 1) {
			
			Object[] arr = stack.toArray();
			int res = num[0];
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals('+'))
					res += num[i + 1];
				else if(arr[i].equals('-'))
					res -= num[i + 1];
				else if(arr[i].equals('x'))
					res *= num[i + 1];
				else if(arr[i].equals('%'))
					res /= num[i + 1];
			}
	
			min = Math.min(min, res);
			max = Math.max(res, max);
		}
		
		else {
			for(int i = 0; i < check.length(); i++) {
				if(!visit[i]) {
					stack.push(check.charAt(i));
					visit[i] = true;
					result(stack);
					stack.pop();
					visit[i] = false;
				}
			}
		}
	}
	

}