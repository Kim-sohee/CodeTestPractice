package main5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// STACK 관련 (LIFO)

/*[문제] 올바른 괄호
	 *[설명] 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
	 *(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
	 * 
	 *[입력]
	 *첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
	 *[출력]
	 *첫 번째 줄에 YES, NO를 출력한다.
	 *
	 *[예시]
	 *입력: (()(()))(()
	 *출력: NO
	 * */
public class Main1 {
	public String solution(String str) {
		String answer = "YES";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char x: str.toCharArray()) {
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		Main1 main = new Main1();
		System.out.println(main.solution(str));
	}
}
