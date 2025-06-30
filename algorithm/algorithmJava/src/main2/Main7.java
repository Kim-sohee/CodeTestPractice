package main2;

import java.util.Scanner;

public class Main7 {
	public int solution(int n, int[] arr) {
		int answer=0;
		int count = 1;
		
		for(int x: arr) {
			if(x==1) {
				answer += count;
				count++;
			}else {
				count = 1;
			}
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		Main7 m = new Main7();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}	
		System.out.print(m.solution(n, arr));
	}
}
