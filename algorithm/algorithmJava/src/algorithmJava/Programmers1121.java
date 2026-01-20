package algorithmJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*프로그래머스 lv.0*/
public class Programmers1121 {
	/*[문제] 이진수 더하기
	 * 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
	 * 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
	 * */
	public static String solution1(String bin1, String bin2) {
		int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
		String answer = Integer.toBinaryString(sum);
		return answer;
	}
	
	/*[문제] 최댓값 만들기(2)
	 * 정수배열 numbers가 매개변수로 주어집니다. 
	 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최대값을 return 하도록 함수를 완성해주세요.
	 * */
	public static int solution02(int[] numbers) {
		Arrays.sort(numbers);
		
		int min = numbers[0] * numbers[1];
		int max = numbers[numbers.length-1] * numbers[numbers.length-2];
		
		return min>max? min: max;
	}
	
	/*[문제] 진료 순서 정하기
	 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
	 * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
	 * */
	public static int[] solution03(int[] emergency) {
		int[] sorted = emergency.clone();
		Arrays.sort(sorted);
		
		Map<Integer, Integer> rank = new HashMap<>();
		int len = sorted.length;
		for(int i=0; i<len; i++) {
			rank.put(sorted[i], len-i);
		}
		
		int[] answer = new int[len];
		for(int i=0; i<len; i++) {
			answer[i] = rank.get(emergency[i]);
		}
		return answer;
	}
	
	/*[문제] 모스부호(1)
	 * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 
	 * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 
	 * 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
	 * 모스부호는 다음과 같습니다.
	 * 
	 * morse = { 
		    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
		    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
		    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
		    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
		    '-.--':'y','--..':'z'
		}
	 * */
	public static String solution04(String letter) {
		Map<String, String> morse = Map.ofEntries(
			    Map.entry(".-", "a"),
			    Map.entry("-...", "b"),
			    Map.entry("-.-.", "c"),
			    Map.entry("-..", "d"),
			    Map.entry(".", "e"),
			    Map.entry("..-.", "f"),
			    Map.entry("--.", "g"),
			    Map.entry("....", "h"),
			    Map.entry("..", "i"),
			    Map.entry(".---", "j"),
			    Map.entry("-.-", "k"),
			    Map.entry(".-..", "l"),
			    Map.entry("--", "m"),
			    Map.entry("-.", "n"),
			    Map.entry("---", "o"),
			    Map.entry(".--.", "p"),
			    Map.entry("--.-", "q"),
			    Map.entry(".-.", "r"),
			    Map.entry("...", "s"),
			    Map.entry("-", "t"),
			    Map.entry("..-", "u"),
			    Map.entry("...-", "v"),
			    Map.entry(".--", "w"),
			    Map.entry("-..-", "x"),
			    Map.entry("-.--", "y"),
			    Map.entry("--..", "z")
			);
		String[] c = letter.split(" ");
		
		String answer = "";
		for(String s: c) {
			answer += morse.get(s);
		}
		return answer;
	}
	
	/*[문제] 구슬을 나누는 경우의 수
	 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 
	 * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
	 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
	 * */
	public static long solution05(int balls, int share) {
		long result = 1;
	    for (int i = 1; i <= share; i++) {
	        result = result * (balls - i + 1) / i;
	    }
	    return result;
	}
	
	
	public static void main(String[] args) {
		//Code 01
		System.out.println(solution1("10", "11"));
		
		
		//Code 02
		int[] numbers = {1, 2, -3, 4, -5};
		System.out.println(solution02(numbers));
		
		
		//Code 03
		int[] emergency = {30, 10, 23, 6, 100};
		System.out.println(solution03(emergency));
		
		
		//Code 04
		String letter = ".... . .-.. .-.. ---";
		System.out.println(solution04(letter));
		
		
		//Code 05
		System.out.println(solution05(5, 3));
	}
}
