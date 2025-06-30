package main2;

import java.util.Scanner;

public class Main12 {
	
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int cnt = 0;
				
				for(int k=0; k<m; k++) {
					int pi=0, pj=0;
					for(int s=0; s<n; s++) {
						if(arr[k][s] == i) pi=s;
						if(arr[k][s] == j) pj=s;
					}
					if(pi<pj) cnt++;	//i가 멘토, j가 멘티
				}
				if(cnt==m) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main12 main = new Main12();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println(main.solution(n, m, arr));
	}
}
