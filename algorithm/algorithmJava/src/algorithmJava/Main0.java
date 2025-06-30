package algorithmJava;

import java.util.*;

public class Main0 {
	public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        
// 방법1.
//        for(int i=0; i<str.length(); i++){
//        	if(str.charAt(i) == t) answer++;
//        }
        
        
// 방법2.
//        for(char x: str.toCharArray()) {
//        	if(x==t) answer++;
//        }
        
// 방법3.
        int totalLen = str.length();
        answer = totalLen - str.replaceAll(Character.toString(t), "").length();
        
        return answer;
	}
	
	public static void main(String[] args) {
        Main0 T = new Main0();
        
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        char c = kb.next().charAt(0);
        
        System.out.println(T.solution(str, c));
    }
}
