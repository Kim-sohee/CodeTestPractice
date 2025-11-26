package algorithmJava;

import java.util.ArrayList;
import java.util.List;

/*프로그래머스 lv.0*/
public class Programmers1126 {
	/*[문제] 숨어있는 숫자의 덧셈(1)
	 * 문자열 my_string이 매개변수로 주어집니다. 
	 * my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
	 * */
	public static int solution01(String my_string) {
		int answer = 0;
		for(char c : my_string.toCharArray()) {
			if(Character.isDigit(c)) {
				answer += Character.getNumericValue(c);
			}
		}
		return answer;
	}
	
	/*[문제] 소인수분해
	 * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 
	 * 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 
	 * 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 
	 * n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	 * */
	public static int[] solution02(int n) {
		// 1. √n 까지의 소수 리스트 생성
	    int limit = (int)Math.sqrt(n);
	    boolean[] isPrime = new boolean[limit + 1];

	    for (int i = 2; i <= limit; i++) {
	        isPrime[i] = true;
	    }

	    for (int i = 2; i * i <= limit; i++) {
	        if (!isPrime[i]) continue;
	        for (int j = i * i; j <= limit; j += i) {
	            isPrime[j] = false;
	        }
	    }

	    // 2. 소수 목록 만들기
	    List<Integer> primes = new ArrayList<>();
	    for (int i = 2; i <= limit; i++) {
	        if (isPrime[i]) primes.add(i);
	    }

	    // 3. 소인수분해
	    int number = n;
	    List<Integer> answer = new ArrayList<>();

	    for (int p : primes) {
	        while (number % p == 0) {
	            answer.add(p);
	            number /= p;
	        }
	    }

	    // 4. 마지막 남은 값이 1보다 크면 그게 소수이므로 추가
	    if (number > 1) {
	        answer.add(number);
	    }

	    return answer.stream().distinct().mapToInt(i -> i).toArray();
	}
	
	public static void main(String[] args) {
		//Code 1
		String my_string = "aAb1B2cC34oOp";
		System.out.println(solution01(my_string));
		
		
		//Code 2
		System.out.println(solution02(20));
	}
}
