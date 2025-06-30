package main1;

import java.util.Scanner;

public class Main9 {
	public int solution(String s) {
		s = s.replaceAll("[A-Za-z]", "");
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		Main9 m = new Main9();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		System.out.print(m.solution(str));
	}
}
