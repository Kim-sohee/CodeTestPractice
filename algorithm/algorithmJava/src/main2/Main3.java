package main2;

import java.util.Scanner;

public class Main3 {
	public String solution(int n, int[] a, int[] b) {
		String answer="";
		
		for(int i=0; i<n; i++) {
			if(a[i] == b[i]) answer += "D";
			else if(a[i]==1 && b[i]==3) answer +="A";
			else if(a[i]==2 && b[i]==1) answer +="A";
			else if(a[i]==3 && b[i]==2) answer +="A";
			else answer +="B";
		}
		return answer;
	}

	public static void main(String[] args) {
		Main3 m = new Main3();
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int[] arr1 = new int[num];
		for(int i=0; i<num; i++) {
			arr1[i] = s.nextInt();
		}
		
		int[] arr2 = new int[num];
		for(int i=0; i<num; i++) {
			arr2[i] = s.nextInt();
		}
		
		for(char x: m.solution(num, arr1, arr2).toCharArray()) {
			System.out.println(x);
		}
	}
}
