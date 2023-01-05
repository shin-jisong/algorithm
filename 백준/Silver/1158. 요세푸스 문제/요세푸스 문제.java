import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		try {
			st = new StringTokenizer(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int n = 0;
		int k = 0;
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> arr = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++)
			arr.add(i);
		
		System.out.print("<");
		int idx = 0;
		
		idx = 0;
		
		while(true) {
			
			idx += (k -1);
			if(idx >= arr.size())
				idx %= arr.size();
			
			System.out.print(arr.get(idx));
			arr.remove(idx);
			
			if(arr.isEmpty()) {
				System.out.print(">");
				break;
			}
			else {
				System.out.print(", ");
			}
		}

	}

}