package main3;

import java.util.Scanner;

public class Main3 {
	
	public int solution(int n, int k, int[] arr) {
		int sum = 0;
		for(int i=0; i<k; i++) {
			sum += arr[i];
		}
		int answer = sum;
		
		for(int i=k; i<n; i++) {
			sum += arr[i] - arr[i-k];
			
			if(sum>answer) {
				answer = sum;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main3 main = new Main3();
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println(main.solution(n, k, arr));
	}
}
