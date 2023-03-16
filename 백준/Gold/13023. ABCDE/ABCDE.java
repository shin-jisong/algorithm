import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public static int n;
	public static ArrayList<Integer>[] graph;
	public static boolean[] visited;
	public static boolean check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[n];
		visited = new boolean[n];
		
		  for (int i = 0; i < n; i++) {  
	            graph[i] = new ArrayList<Integer>();
	        }
		
		int u, v;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		for (int i = 0; i < n; i++) {
			
			if(check) {
				System.out.print(1);
				return;
			}
			
			dfs(i, 1);
		}
		
		System.out.print(0);
	}
	
	public static void dfs(int i, int depth) {
		visited[i] = true;
		
		
		if(depth == 5 || check) {
			check = true;
			return;
		}
		
		for(int j=0; j < graph[i].size(); j++) {
			if(visited[graph[i].get(j)] == false) {
				dfs(graph[i].get(j), depth+1);
				
			}
		}
		
		visited[i] = false;
	}

}