package main4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		/*내가 생각한 방법 ====================================
		Set<String> arr = new HashSet<>(Arrays.asList(str.split("")));
		
		int max = 1;
		String maxAlpab = "";
		
		for(String s : arr) {
			int len = num - str.replace(s, "").length();
			if(max < len) {
				max = len;
				maxAlpab = s;
			}
		}
		System.out.println(maxAlpab);	
		=============================================*/
		
		//HashMap을 사용하여 풀이하기=============================
		char answer=' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
		//=============================================
	}
}
