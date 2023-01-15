import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer arr = new StringTokenizer(br.readLine(), "[],");
			Deque<Integer> deq = new ArrayDeque<>();

			for(int j = 0; j < n; j++) {
				deq.add(Integer.parseInt(arr.nextToken()));
			}
			check(p, deq);

			
		}
		
		System.out.print(sb);

	}
	
	public static void check(String p, Deque<Integer> deq) {
		
		boolean reverse = false;
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == 'R')
				reverse = !reverse;
			else if(p.charAt(i) == 'D') {
				
				if(deq.isEmpty()) {
					sb.append("error\n");
					return;
				}
				
				if(reverse)
					deq.removeLast();
				else
					deq.removeFirst();
			}
		}
		
		if(deq.isEmpty()) {
			sb.append("[]\n");
			return;
		}
		
		if(reverse) {
			sb.append("[");
			while(true) {
				sb.append(deq.removeLast());
				if(deq.isEmpty()) {
					sb.append("]\n");
					break;
				}
				else
					sb.append(",");
			}
			
		}
		else {
			sb.append("[");
			while(true) {
				sb.append(deq.removeFirst());
				if(deq.isEmpty()) {
					sb.append("]\n");
					break;
				}
				else
					sb.append(",");
			}
			
		}
			
	}

}