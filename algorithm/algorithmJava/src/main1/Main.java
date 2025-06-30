package main1;

import java.util.Scanner;
import java.math.*;

public class Main{
    public int solution(int a, int b){
        int answer = (int)Math.pow(a,b) % 10;
        
        return answer;
    }
    
    public static void main(String[] args){
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=0; i<=num; i++) {
        	int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a+","+b+","+m.solution(a, b));
        }
    }
}