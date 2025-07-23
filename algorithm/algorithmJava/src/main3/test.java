package main3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


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
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	    
//	    String[] line = br.readLine().split(" ");
//	    
//	    int n = Integer.parseInt(line[0]);
//	    int kim = Integer.parseInt(line[1]);
//	    int im = Integer.parseInt(line[2]);
//	    
//	    int round = 0;
//	    
//	    while(kim != im) {
//	        kim = (kim + 1) /2;
//	        im = (im + 1) /2;
//	        round++;
//	    }
//	    bw.write(round+"");
//	    
//	    bw.flush();
//	    bw.close();
//	    br.close();
//	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String[] str = br.readLine().split("");
//		
//		int[] alpabet = new int[26];
//		Arrays.fill(alpabet, -1);
//		
//		for(int i=0; i<str.length; i++) {
//			char s = str[i].charAt(0);
//			int num = s-'a';
//			
//			if(alpabet[num] == -1) alpabet[num] = i;
//		}
//		
//		for(int i=0; i<alpabet.length; i++) {
//			bw.write(alpabet[i]+" ");
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int num = Integer.parseInt(br.readLine());
//		
//		for(int i=0; i<num; i++) {
//			String result = "";
//			String[] line = br.readLine().split(" ");
//			
//			int n = Integer.parseInt(line[0]);
//			String[] alpha = line[1].split("");
//			
//			for(int j=0; j<alpha.length; j++) {
//				result += alpha[j].repeat(n);
//			}
//			
//			bw.write(result+"\n");
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
	public static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		String reversedStr = sb.reverse().toString();
		
		return reversedStr;
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String[] numbers = br.readLine().split(" ");
//		
//		int a = Integer.parseInt(reverse(numbers[0]));
//		int b = Integer.parseInt(reverse(numbers[1]));
//		
//		if(a>b) bw.write(a+"");
//		if(b>a) bw.write(b+"");
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String alpha = br.readLine();
//		int result = 0;
//		
//		for(int i=0; i<alpha.length(); i++) {
//			char a = alpha.charAt(i);
//            
//            if ('A' <= a && a <= 'C') {
//                result += 3;
//            } else if ('D' <= a && a <= 'F') {
//                result += 4;
//            } else if ('G' <= a && a <= 'I') {
//                result += 5;
//            } else if ('J' <= a && a <= 'L') {
//                result += 6;
//            } else if ('M' <= a && a <= 'O') {
//                result += 7;
//            } else if ('P' <= a && a <= 'S') {
//                result += 8;
//            } else if ('T' <= a && a <= 'V') {
//                result += 9;
//            } else if ('W' <= a && a <= 'Z') {
//                result += 10;
//            }
//		}
//		bw.write(result+"");
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String str;
//		while((str=br.readLine()) != null && !str.isEmpty()) {
//			bw.write(str+"\n");
//		}
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException{
//		int[] origin = {1, 1, 2, 2, 2, 8};
//		String result = "";
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String[] line = br.readLine().split(" ");
//		
//		for(int i=0; i<line.length; i++) {
//			int num = Integer.parseInt(line[i]);
//			
//			result += (origin[i]-num)+" ";
//		}
//		
//		bw.write(result);
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String str = br.readLine();
//		
//		String reversed = new StringBuffer(str).reverse().toString();
//		
//		if(str.equals(reversed)) {
//			bw.write("1");
//		}else {
//			bw.write("0");
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
	public static boolean groupWord(String str) {
		boolean[] alpha = new boolean[26];
		
		char prev = '\0';
		
		for(char c : str.toCharArray()) {
			if(c!=prev) {
				if(alpha[c-'a']) {
					return false;
				}
				alpha[c-'a'] = true;
			}
			prev = c;
		}
		return true;
	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int num = Integer.parseInt(br.readLine());
//		int count = 0;
//		
//		for(int i=0; i<num; i++) {
//			String str = br.readLine();
//			if(groupWord(str)) {
//				count++;
//			}
//		}
//		bw.write(count+"");
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String[][] arr = new String[9][9];
//		int max = 0;
//		int maxRow=0; 
//		int maxCol = 0;
//		
//		//채우기
//		for(int i=0; i<9; i++) {
//			arr[i] = br.readLine().split(" ");
//		}
//		
//		for(int row=0; row<9; row++) {
//			for(int col=0; col<9; col++) {
//				if(max < Integer.parseInt(arr[row][col])) {
//					max = Integer.parseInt(arr[row][col]);
//					maxRow = row+1;
//					maxCol = col+1;
//				}
//			}
//		}
//		
//		bw.write(max+"\n"+maxRow+" "+maxCol);
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String[] line = br.readLine().split(" ");
//		int n = Integer.parseInt(line[0]);
//		int m = Integer.parseInt(line[1]);
//		
//		String[][] a = new String[n][m];
//		String[][] b = new String[n][m];
//		
//		//채우기
//		for(int i=0; i<n; i++) {
//			a[i] = br.readLine().split(" ");
//		}
//		for(int i=0; i<n; i++) {
//			b[i] = br.readLine().split(" ");
//		}
//		
//		//찍기
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				int num_a = Integer.parseInt(a[i][j]);
//				int num_b = Integer.parseInt(b[i][j]);
//				
//				bw.write(String.valueOf(num_a + num_b) + " ");
//			}
//			bw.newLine();
//		}
//		bw.flush();
//		
//		bw.close();
//		br.close();
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = new String[5];
		int maxLen = 0;
		String result ="";
		
		for(int i=0; i<5; i++) {
			arr[i] = br.readLine();
			maxLen = Math.max(maxLen, arr[i].length());
		}
		
		for (int i = 0; i < maxLen; i++) {
		    for (int j = 0; j < 5; j++) {
		        if (arr[j].length() > i) {
		            result+= arr[j].charAt(i);
		        }
		    }
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
	}
}
