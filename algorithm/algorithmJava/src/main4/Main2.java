package main4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;


public class Main2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*내가 푼 방법 ========================================
		String[] str1 = br.readLine().split("");
		String[] str2 = br.readLine().split("");
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(Arrays.equals(str1, str2)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		===============================================*/

		
		//HashMap을 사용한 문제 풀이 ===============================
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char x : str1.toCharArray()) {
			map.put(x,  map.getOrDefault(x, 0)+1);
		}
		
		for(char x : str2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) {
				answer = "NO";
				return;
			}
			map.put(x, map.get(x)-1);
		}
		
		System.out.println(answer);
		//==============================================
	}
}
