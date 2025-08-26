package main3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main6 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line =br.readLine().split(" ");
		
		int n= Integer.parseInt(line[0]);
		int k= Integer.parseInt(line[1]);
		String[] arr = br.readLine().split(" ");
		
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = Integer.parseInt(arr[i]);
		}
		
		int left = 0;
		int count = 0;
		int maxLang = 0;
		
		for(int right=0; right<n; right++) {
			if(nums[right]==0) count++;
			
			while(count>k) {
				if(nums[left] == 0) count--;
				left++;
			}
			maxLang = Math.max(maxLang, right-left+1);
		}
		System.out.println(maxLang);
	}

}
