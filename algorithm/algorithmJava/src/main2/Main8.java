package main2;

import java.util.Scanner;

public class Main8 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			int cnt=1;
			for(int j=0; j<n; j++) {
				if(arr[j]>arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main8 m = new Main8();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] score = new int[n];
		for(int i=0; i<n; i++) {
			score[i] = s.nextInt();
		}
		
		for(int x: m.solution(n, score)) {
			System.out.print(x+" ");
		}
	}
}
