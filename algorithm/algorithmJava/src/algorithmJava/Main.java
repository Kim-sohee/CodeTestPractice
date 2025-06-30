package algorithmJava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		String result = "";
		
		int num = n / 4;
		
		if(n%4 > 0) result += "long ";
		
		for(int i=0; i<num; i++) {
			result += "long ";
		}
		
		System.out.println(result+"int");
	}
}
