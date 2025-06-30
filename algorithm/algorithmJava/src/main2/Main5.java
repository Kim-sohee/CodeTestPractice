package main2;

import java.util.Scanner;

public class Main5 {
	public int solution(int n) {
		int answer=0;
		
		int[] ch = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j=j+i) ch[j]=1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main5 m = new Main5();
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		System.out.print(m.solution(num));
		
	}

}
