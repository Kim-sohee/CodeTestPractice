package algorithmJava;

import java.util.Arrays;

/*프로그래머스 0단계 문제 풀이*/
public class Programmers1112 {
	/*[문제] 피자 나눠 먹기(3)
	 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, 
	 * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	 * */
	public static int solution01(int slice, int n) {
		int answer = (int)Math.ceil(n/(slice+0.0));
		return answer;
	}
	
	/*[문제] 직각삼각형 출력하기
	 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 
	 * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
	 * */
	public static void solution02(int n) {
		String star = "*";
		for(int i=1; i<=n; i++) {
			System.out.println(star.repeat(i));
		}
	}
	
	
	/*[문제] 컨트롤 제트
	 * 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 
	 * 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 
	 * 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
	 * */
	public static int solution03(String s) {
		String str = s.replaceAll("\\d+\\s*Z", "").replaceAll("\\s{2,}", " ").trim();
		int answer = Arrays.stream(str.split(" ")).filter(x -> x.matches("-?\\d+")).mapToInt(Integer::parseInt).sum();
		return answer;
	}
	
	/*[문제] 분수의 덧셈
	 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
	 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	 * */
	public static int[] solution04(int numer1, int denom1, int numer2, int denom2) {
		int numerator = numer1 * denom2 + numer2 * denom1;
	    int denominator = denom1 * denom2;

	    int gcd = gcd(numerator, denominator);

	    return new int[]{numerator / gcd, denominator / gcd};
	}
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static void main(String[] args) throws Exception{
		//code 1
		System.out.println(solution01(7, 10));
		
		
		//code 2
		solution02(4);
		
		
		//code 3
		System.out.println(solution03("10 Z 20 Z 1"));
		
		
		//code 4
		System.out.println(solution04(9, 2, 1, 3));
	}
}
