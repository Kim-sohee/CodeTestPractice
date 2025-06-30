package main2;

import java.util.Scanner;

public class Main2 {
	public int solution(int n, int[] arr) {
		int answer = 1;
		int min = arr[0];
		
		for(int i=1; i<n; i++) {
			if(arr[i] > min) {
				min = arr[i];
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main2 m = new Main2();
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(m.solution(num, arr));
	}
}
