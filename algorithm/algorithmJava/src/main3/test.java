package main3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int total = Integer.parseInt(br.readLine());
//		String[] arr = br.readLine().split(" ");
//		
//		int min = Integer.parseInt(arr[0]);
//		int max = Integer.parseInt(arr[0]);
//		
//		for(int i=0; i<total; i++) {
//			int num = Integer.parseInt(arr[i]);
//			
//			if(num < min) min = num;
//			
//			if(num > max) max = num;
//		}
//		
//		bw.write(min + " " + max);
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
//		String str = br.readLine();
//		int num = Integer.parseInt(br.readLine());
//		
//		bw.write(str.substring(num-1, num));
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int max = 0;
//		int count = 0;
//		
//		for(int i=0; i<9; i++) {
//			int num = Integer.parseInt(br.readLine());
//			if(num>max) {
//				max = num;
//				count = i+1;
//			}
//		}
//		bw.write(max + "\n"+ count);
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
//		
//		int[] buckets = new int[Integer.parseInt(line[0])];
//		int num = Integer.parseInt(line[1]);
//		
//		for(int i=0; i<num; i++) {
//			String[] n = br.readLine().split(" ");
//			
//			int start = Integer.parseInt(n[0]);
//			int end = Integer.parseInt(n[1]);
//			int ball = Integer.parseInt(n[2]);
//			
//			for(int j=start; j<=end; j++) {
//				buckets[j-1] = ball;
//			}
//		}
//		
//		for(int i=0; i<buckets.length; i++) {
//			bw.write(buckets[i]+" ");
//		}
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
//		
//		int[] buckets = new int[Integer.parseInt(line[0])];
//		Arrays.setAll(buckets, i-> i+1);
//		
//		int num = Integer.parseInt(line[1]);
//		
//		for(int i=0; i<num; i++) {
//			String[] n = br.readLine().split(" ");
//			int a = Integer.parseInt(n[0])-1;
//			int b = Integer.parseInt(n[1])-1;
//			
//			int temp = buckets[a];
//			
//			buckets[a] = buckets[b];
//			buckets[b] = temp;
//		}
//		
//		for(int j=0; j<buckets.length; j++) {
//			bw.write(buckets[j]+" ");
//		}
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
//		int[] student = new int[30];
//		Arrays.fill(student, 0);
//		
//		for(int i=0; i<28; i++) {
//			int num = Integer.parseInt(br.readLine())-1;
//			
//			student[num] = 1;
//		}
//		
//		String result = "";
//		for(int i=0; i<student.length; i++) {
//			if(student[i] == 0) result += (i+1)+"\n";
//		}
//		
//		bw.write(result);
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
//		List<Integer> division = new ArrayList<>();
//		
//		for(int i=0; i<10; i++) {
//			int num = Integer.parseInt(br.readLine());
//			
//			division.add(num%42);
//		}
//		
//		Set<Integer> set = new HashSet<>(division);
//		
//		bw.write(set.size()+"");
//		
//		bw.close();
//		br.close();
//	}
	
	public static int marinPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distance = (int) (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		int result = 0;

		if(x1 == x2 && y1 == y2 && r1 == r2) {
			result = -1;
		}else if(distance > Math.pow(r1+r2, 2)) {
			result = 0;
		}else if(distance < Math.pow(r2-r1, 2)) {
			result = 0;
		}else if(distance == Math.pow(r2-r1, 2)) {
			result = 1;
		}else if(distance == Math.pow(r1+r2, 2)) {
			result = 1;
		}else {
			result = 2;
		}

		return result;
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int testCase = Integer.parseInt(br.readLine());
//		
//		for(int i=0; i<testCase; i++) {
//			String[] line = br.readLine().split(" ");
//			
//			int x1 = Integer.parseInt(line[0]);
//			int y1 = Integer.parseInt(line[1]);
//			int r1 = Integer.parseInt(line[2]);
//			
//			int x2 = Integer.parseInt(line[3]);
//			int y2 = Integer.parseInt(line[4]);
//			int r2 = Integer.parseInt(line[5]);
//			
//			bw.write(marinPoint(x1, y1, r1, x2, y2, r2) + "\n");
//		}
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
	static int zero;
	static int one;
	static int zero_plus_one;
	
	public static void fibonacci(int n) {
		zero = 1;
		one = 0;
		zero_plus_one = 1;
		
		for(int i=0; i<n; i++) {
			zero = one;
			one = zero_plus_one;
			zero_plus_one = zero + one;
		}
	}
	
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int total = Integer.parseInt(br.readLine());
//		
//		for(int i=0; i< total; i++) {
//			int num = Integer.parseInt(br.readLine());
//			fibonacci(num);
//			
//			bw.write(zero+" "+one+"\n");
//		}
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String[] line = br.readLine().split(" ");
//		
//		int[] buckets = new int[Integer.parseInt(line[0])];
//		Arrays.setAll(buckets, i-> i+1);
//		
//		int total = Integer.parseInt(line[1]);
//		
//		for(int i=0; i<total; i++) {
//			String[] n = br.readLine().split(" ");
//			int start = Integer.parseInt(n[0])-1;
//			int end = Integer.parseInt(n[1])-1;
//			
//			while(start < end) {
//				int temp = buckets[start];
//				buckets[start] = buckets[end];
//				buckets[end] = temp;
//				
//				start++;
//				end--;
//			}
//		}
//		
//		for(int i=0; i<buckets.length; i++) {
//			bw.write(buckets[i] + " ");
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int total = Integer.parseInt(br.readLine());
//		
//		String[] array =br.readLine().split(" ");
//		int[] intArr = new int[total];
//		double result = 0;
//		int max = 0;
//		
//		//max값 구하기
//		for(int i=0; i<array.length; i++) {
//			int num = Integer.parseInt(array[i]);
//			intArr[i] = num;
//			
//			if(max < num) max = num;
//		}
//		
//		//평균
//		double sum = 0;
//		for(int i=0; i<intArr.length; i++) {
//			sum += (intArr[i]/(double)max) * 100;
//		}
//		bw.write(sum/total+"");
//		
//		bw.flush();
//		
//		bw.close();
//		br.close();
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String[] line = br.readLine().split(" ");
	    
	    int n = Integer.parseInt(line[0]);
	    int kim = Integer.parseInt(line[1]);
	    int im = Integer.parseInt(line[2]);
	    
	    int round = 0;
	    
	    while(kim != im) {
	        kim = (kim + 1) /2;
	        im = (im + 1) /2;
	        round++;
	    }
	    bw.write(round+"");
	    
	    bw.flush();
	    bw.close();
	    br.close();
	}
}
