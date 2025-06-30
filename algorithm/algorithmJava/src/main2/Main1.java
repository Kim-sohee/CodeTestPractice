package main2;

import java.util.*;

public class Main1 {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer= new ArrayList<>();
		answer.add(arr[0]);
		
		for(int x=1; x<n; x++) {
			if(arr[x] > arr[x-1]) {
				answer.add(arr[x]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main1 m = new Main1();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x: m.solution(num, arr)) {
			System.out.print(x+" ");
		}
	}
}
