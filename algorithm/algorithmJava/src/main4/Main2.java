package main4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str1 = br.readLine().split("");
		String[] str2 = br.readLine().split("");
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(Arrays.equals(str1, str2)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
