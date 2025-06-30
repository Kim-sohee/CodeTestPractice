package main1;

import java.util.*;

public class Main6 {
	public String solution(String str) {
		String answer="";
		
		for(int i=0; i<str.length(); i++) {
			if(i==str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main6 m = new Main6();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(m.solution(str));
		
	}
}
