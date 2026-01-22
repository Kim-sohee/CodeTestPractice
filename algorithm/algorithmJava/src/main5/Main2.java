package main5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/* [문제] 괄호 문자 제거
 * [설명] 입력된 문자열에서 소괄호 ()사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성
 * [입력] 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * [출력] 남은 문자만 출력한다.
 * 
 * [예시]
 * 예시 입력: (A(BC)D)EF(G(H)(IJ)K)LM(N)
 * 예시 출력: EFLM
 * */
public class Main2 {
	public String solution(String str) {
		String answer = "";
		
		Stack<Character> stack = new Stack<Character>();
		for(char x: str.toCharArray()) {
			if(x==')') {
				while(stack.pop() != '('); 
			}else {
				stack.push(x);
			}
		}
		
		for(int i=0; i<stack.size(); i++) answer += stack.get(i);
		return answer;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		Main2 m = new Main2();
		System.out.println(m.solution(str));
	}
}
