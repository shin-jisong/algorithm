import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static int m, n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		
		check(stack, 0);

	}
	
	public static void check(Stack<Integer> st, int depth) {
		
		
		if(depth == n) {
			System.out.println(st.toString().replace("[", "").replace("]", "").replace(",", ""));
			return;
		}
		else if(depth < n){
			
			for(int i = 1; i <= m; i++) {
				if(st.search(i) == -1) {
					
					st.push(i);
					check(st, depth + 1);
					st.pop();
				}
			}
		}
		
	}

}