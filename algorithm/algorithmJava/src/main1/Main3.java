package main1;

import java.util.Scanner;

public class Main3 {
	public String solution(String str) {
		String answer = "";
		
		int max = Integer.MIN_VALUE;
		
		String[] array = str.split(" ");
		for(String x : array) {
			if(max < x.length()) {
				max = x.length();
				answer = x;
			}
		}
 		
		return answer;
	}
	
	public static void main(String[] args) {
		Main3 T = new Main3();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.print(T.solution(str));
	}
}
