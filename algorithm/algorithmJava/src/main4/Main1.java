package main4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
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
	}
}
