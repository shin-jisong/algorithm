import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	
	public static int n, m;
	public static boolean[][] graph;
	public static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		graph = new boolean[n+1][n+1];
		visit = new boolean[n+1];
		
		int u, v;
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			
			graph[u][v] = true;
			graph[v][u] = true;
		}
		
		int num = 0;
		for(int i = 1; i < n+1; i++) {
			if(visit[i] == false) {
				dfs(i);
				num++;
			}
		}
		
		System.out.print(num);

	}
	
	public static void dfs(int i) {
		visit[i] = true;
		
		for(int j=1; j<n+1; j++) {
			if(graph[i][j] == true && visit[j] == false) {
				dfs(j);
			}
		}
	}

}