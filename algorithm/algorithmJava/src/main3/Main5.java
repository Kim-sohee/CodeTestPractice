package main3;

import java.util.Scanner;

public class Main5 {
	public int solution(int num) {
		int count = 0;
		int sum=0, lt=1;
		
		for(int rt=1; rt<=num/2+1; rt++) {
			sum += rt;
			if(sum == num) count++;
			
			while(num <= sum) {
				sum -= (lt++);
				if(sum == num) count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Main5 main = new Main5();
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		System.out.println(main.solution(num));
	}
}
