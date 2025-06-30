package main2;

import java.util.Scanner;

public class Main10 {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int solution(int n, int[][] arr) {
		int result = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//내가 봉우리인지 아닌지 확인하는 플래그
				boolean flag = true;
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					
					if(nx >=0 && nx<n && ny>=0 && ny<n) {	//바운더리 걸러내기					
						if(arr[nx][ny] >= arr[i][j]) {
							flag = false;
							break;
						}
					}
				}
				if(flag) result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Main10 m = new Main10();
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println(m.solution(n, arr));
	}
}
