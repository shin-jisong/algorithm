import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		boolean[] visited = new boolean[100001];
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> set = new LinkedList<>();
		
		if (n == k) {
            System.out.println(0);
            return;
        }
		
		int count = 0;
		
		set.add(n);
		visited[n] = true;
		
		while(true) {
			
			count++;
			Queue<Integer> temp = new LinkedList<>();
			for(int i: set) {
				
				visited[i] = true;
				
				if (i-1 == k || i+1 == k || i*2 == k) {
                    System.out.println(count);
                    return;
                }
                if (i-1 >= 0 && !visited[i-1]) {
                    visited[i-1] = true;
                    temp.add(i-1);
                }
                if (i+1 <= 100000 && !visited[i+1]) {
                    visited[i+1] = true;
                    temp.add(i+1);
                }
                if (i*2 <= 100000 && !visited[i*2]) {
                    visited[i*2] = true;
                    temp.add(i*2);
                }
				
			}
			
			set.clear();
			set.addAll(temp);
			
		}

	}
}