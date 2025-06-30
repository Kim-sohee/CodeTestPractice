package algorithmJava.main3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main1 {
	public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
//		int[] answer = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
//		Arrays.sort(answer);
//		return answer;
		
		//Two Pointers로 풀기
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(arr1[p1]<arr2[p2]) answer.add(arr1[p1++]);
			else answer.add(arr2[p2++]);
		}
		while(p1<n) {
			answer.add(arr1[p1++]);
		}
		while(p2<m) {
			answer.add(arr2[p2++]);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main1 main = new Main1();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = s.nextInt();
		}
		int m = s.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = s.nextInt();
		}
		
		ArrayList<Integer> answer = main.solution(n, arr1, m, arr2);
		for(int result : answer) {
			System.out.print(result+" ");			
		}
	}
}
