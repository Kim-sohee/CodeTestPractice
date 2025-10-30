package main4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		
		String[] price = br.readLine().split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<k; i++) {
			map.put(price[i], map.getOrDefault(price[i], 0)+1);
		}
		sb.append(map.size()).append(" ");
		
		for(int i=k; i<n; i++) {
			String left = price[i-k];
			map.put(left, map.get(left)-1);
			if(map.get(left)==0) map.remove(left);
			
			String right = price[i];
			map.put(right, map.getOrDefault(right, 0)+1);
			
			sb.append(map.size()).append(" ");
		}
		bw.write(sb.toString().trim());
		bw.flush();
	}
}
