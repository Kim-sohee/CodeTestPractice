package main1;

import java.util.Scanner;

public class Main12 {
	public String solution(int num, String str) {
		String answer = "";
		
		for(int i=0; i<num; i++) {
			String s = str.substring(i*7, i*7+7);
			s = s.replace('#', '1');
			s = s.replace('*', '0');
			
			char c = (char)Integer.parseInt(s, 2);
			answer += c;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main12 T = new Main12();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		String str = kb.next();

		System.out.print(T.solution(num, str));
	}	
}
