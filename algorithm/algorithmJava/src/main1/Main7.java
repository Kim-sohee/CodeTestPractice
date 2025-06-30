package main1;

import java.util.Scanner;

public class Main7 {
	public String solution(String str) {
		String answer="";
	
		String upStr = str.toUpperCase();
		
		String tmp = new StringBuilder(upStr).reverse().toString();
		
		if(upStr.equals(tmp)) answer="YES";
		else answer="NO";
		
		return answer;
	}

	public static void main(String[] args) {
		Main7 m = new Main7();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(m.solution(str));

	}
}
