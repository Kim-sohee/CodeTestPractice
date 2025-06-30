package main2;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	
	public int[] solution(int num) {
		int[] answer = new int[num];
		Arrays.fill(answer, 1);  //1로 채우기
		
		for(int i=2; i<num; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main4 m = new Main4();
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int x : m.solution(num)) {
			System.out.print(x+" ");
		}
	}
}
