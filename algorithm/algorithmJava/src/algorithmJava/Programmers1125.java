package algorithmJava;

import java.util.Arrays;

/*프로그래머스 lv.0*/
public class Programmers1125 {
	/*[문제] 2차원으로 만들기
	 * 정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
	 * num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다. 
	 * 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
	 * */
	public static int[][] solution01(int[] num_list, int n) {
		int rows = num_list.length / n;
		int[][] answer = new int[rows][n];
		
		for(int i=0; i<rows; i++) {
			answer[i] = Arrays.copyOfRange(num_list, i * n, i * n + n);
		}
		return answer;
	}
	
	/*[문제] 공 던지기
	 * 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 
	 * 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다. 
	 * 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, 
	 * k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
	 * */
	public static int solution02(int[] numbers, int k) {
		int answer = 0;
		int n = 0;
		
		for(int i=0; i<k; i++) {
			if(n > numbers.length-1) n = n % numbers.length;
			answer = numbers[n];
			n+=2;
		}
		
		return answer;
		
		/*더 나은 풀이 - 한 줄
		 * return (k-1)*2 % numbers.length+1; */
	}
	
	/*[문제] 배열 회전시키기
	 * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
	 * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
	 * */
	public static int[] solution03(int[] numbers, String direction) {
		int last = numbers.length;
		int[] answer = new int[last];
		
		//right: idx++, left: idx--
		if(direction.equals("right")) {
			answer[0] = numbers[last-1];
			for(int i=0; i<last-1; i++) {
				answer[i+1] = numbers[i];
			}
		}else if(direction.equals("left")) {
			answer[last-1] = numbers[0];
			for(int i=0; i<last-1; i++) {
				answer[i] = numbers[i+1];
			}
		}
		return answer;
	}
	
	/*[문제] 합성수 찾기
	 * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
	 * 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
	 * */
	public static int solution04(int n) {
		if(n<4) return 0;
		
		boolean[] prime = new boolean[n + 1];
	    Arrays.fill(prime, true);

	    for (int i = 2; i * i <= n; i++)
	        if (prime[i])
	            for (int j = i * i; j <= n; j += i)
	                prime[j] = false;

	    int count = 0;
	    for (int i = 4; i <= n; i++)
	        if (!prime[i]) count++;

	    return count;
	}
	
	public static void main(String[] args) {
		//Code 1
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(solution01(num_list, 2));
		
		
		//Code 2
		int[] numbers = {1, 2, 3};
		System.out.println(solution02(numbers, 3));
		
		
		//Code 3
		System.out.println(solution03(numbers, "right"));
	}
	
}
