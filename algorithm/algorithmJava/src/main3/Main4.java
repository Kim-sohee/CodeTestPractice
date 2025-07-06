package main3;

import java.util.Scanner;

public class Main4 {
	public int solution(int n, int m, int[] arr) {
		int count = 0;
		int sum = 0;
		int lt = 0;
		
		for(int rt=0; rt<n; rt++) {
			sum += arr[rt];
			if(sum == m) count++;
			
			while(m <= sum) {
				sum -=arr[lt++];
				if(sum == m) count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Main4 main = new Main4();
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println(main.solution(n, m, arr));
	}
}
