import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static public int n, m, v;
	public static boolean[][] graph;
	public static boolean[] visitDFS, visitBFS;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		graph = new boolean[n+1][n+1];
		
		visitDFS = new boolean[n+1];
		visitBFS = new boolean[n+1];
		
		int a, b;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = true;
			graph[b][a] = true;
			
		}
		
		dfs(v);
		System.out.println();
		bfs(v);
		
		

	}
	
	public static void dfs(int i) {
		visitDFS[i] = true;
		System.out.print(i + " ");
		for(int j=1; j<n+1; j++) {
			if(graph[i][j] == true && visitDFS[j] == false) {
				dfs(j);
			}
		}
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(i);
		visitBFS[i] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp + " ");
			for(int j=1; j<n+1; j++) {
				if(graph[temp][j] == true && visitBFS[j] == false) {
					q.offer(j);
					visitBFS[j] = true;
				}
			}
		}
	}

}