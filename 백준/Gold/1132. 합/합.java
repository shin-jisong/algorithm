import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Long> map = new HashMap<Integer,Long>();
		boolean[] checking = new boolean[10];
		
		for(int i = 0; i <= 9; i++) {
			map.put(i, (long) 0);
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				int idx = str.charAt(j) - 65;
				map.replace(idx, map.get(idx) + (long) Math.pow(10, str.length() - j - 1)); 
			}
			checking[str.charAt(0) - 65] = true;
		}
		List<Integer> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
		Long min = map.get(keySet.get(0));
		int minIdx = 0;
		for(int i = 0; i < 10; i++) {
			if(!checking[keySet.get(i)] && min > map.get(keySet.get(i))) {
				minIdx = keySet.get(i);
				min = map.get(keySet.get(i));
			}
		}
		
		long check = 9;
		long count = 0;
		
		for(Integer key : keySet) {
			
			if(key == minIdx)
				continue;
			count += (check * map.get(key));
			check--;
		}
		
		System.out.print(count);

	}

}