package main2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {
	public boolean isPrime(int num) {
		if(num == 1) return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] numArr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			int tmp = Integer.parseInt(new StringBuilder(String.valueOf(numArr[i])).reverse().toString());
			if(isPrime(tmp)) answer.add(tmp);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main6 m = new Main6();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] numArr = new int[n];
		
		for(int i=0; i<n; i++) {
			numArr[i] = s.nextInt();
		}
		
		for(int x: m.solution(n, numArr)) {
			System.out.print(x+" ");
		}
		
	}

}
