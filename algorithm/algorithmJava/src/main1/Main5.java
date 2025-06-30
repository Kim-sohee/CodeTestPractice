package main1;

import java.util.Scanner;

public class Main5 {
	public String solution(String str) {
		String result;
		char[] s= str.toCharArray();
		
		int lt=0, rt=str.length()-1;
		
		while(lt<rt) {
			//알파벳이 아닐 때
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		result = String.copyValueOf(s);
		
		return result;
	}
	
	public static void main(String[] args) {
		Main5 m = new Main5();
		Scanner kb = new Scanner(System.in);
		String str= kb.next();
		System.out.println(m.solution(str));
	}
}
