package main3;

import java.io.*;

public class test {
//	 public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        
//        int total = Integer.parseInt(br.readLine());
//        
//        for(int i=1; i<=total; i++){
//            String line = br.readLine();
//            String[] token = line.split(" ");
//            int a = Integer.parseInt(token[0]);
//            int b = Integer.parseInt(token[1]);
//            int sum = a + b;
//            
//            bw.write("Case #"+i+": "+a+" + "+b+" = "+sum+"\n");
//        }
//        bw.flush();
//        
//        bw.close();
//        br.close();
//	}
	
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int total  = Integer.parseInt(br.readLine());
//		String[] arr = (br.readLine()).split(" ");
//		
//		String v = br.readLine();
//		int count = 0;
//		
//		for(int i=0; i<total; i++) {			
//			if(arr[i].equals(v)) count++;
//		}
//		bw.write(String.valueOf(count));
//		
//		bw.flush();
//		
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String[] line = br.readLine().split(" ");
//		int n = Integer.parseInt(line[0]);
//		int x = Integer.parseInt(line[1]);
//		
//		String[] arr = br.readLine().split(" ");
//		
//		for(int i=0; i<n; i++) {
//			if(x> Integer.parseInt(arr[i])) bw.write(arr[i]+" ");
//		}
//		bw.flush();
//		
//		bw.close();
//		br.close();
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		int min = Integer.parseInt(arr[0]);
		int max = Integer.parseInt(arr[0]);
		
		for(int i=0; i<total; i++) {
			int num = Integer.parseInt(arr[i]);
			
			if(num < min) min = num;
			
			if(num > max) max = num;
		}
		
		bw.write(min + " " + max);
		
		bw.flush();
		
		bw.close();
		br.close();
	}
}
