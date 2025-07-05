package main3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	
	public List<Integer> soultion(int num1, int[] arr1, int num2, int[] arr2){
		List<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				if(arr1[i]==arr2[j]) {
					answer.add(arr1[i]);
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main2 main = new Main2();
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int[] arr1 = new int[num1];
		for(int i=0; i<num1; i++) {
			arr1[i] = s.nextInt();
		}
		
		int num2 = s.nextInt();
		int[] arr2 = new int[num2];
		for(int i=0; i<num2; i++) {
			arr1[i] = s.nextInt();
		}
		
		List<Integer> answer = main.soultion(num1, arr1, num2, arr2);
		for(int n : answer) {
			System.out.print(n+" ");
		}
		s.close();
	}
}
