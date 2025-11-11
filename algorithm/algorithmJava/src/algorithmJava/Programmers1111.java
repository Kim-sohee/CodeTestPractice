package algorithmJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*프로그래머스 0단계 문제 풀이*/
public class Programmers1111 {
	/*[문제]로그인 성공
	 * 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때, 
	 * 다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.
	 *  - 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
	 *  - 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
	 * */
	public static String solution01(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for(int i=0; i<db.length; i++) {
        	if(id_pw[0].equals(db[i][0])) {
        		if(id_pw[1].equals(db[i][1])) {
        			answer = "login";
        		}else {
        			answer = "wrong pw";
        		}
        	}
        }
        
        return answer;
    }
	
	/*[문제] 최빈값 구하기
	 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
	 * 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
	 * */
	public static int solution02(int[] array) {
		int answer = -1;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num: array) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		int maxCount = 0;
		boolean duplicate = false;
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			
			if(value > maxCount) {
				maxCount = value;
				answer = key;
				duplicate = false;
			}else if(value == maxCount) {
				duplicate = true;
			}
		}
		
		return duplicate? -1 : answer;
	}
	
	/*[문제] 최댓값 만들기
	 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
	 * */
	public static int solution03(int[] numbers) {
		numbers = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        int answer = numbers[0] * numbers[1];
		return answer;
	}
	
	
	/*[문제] 가까운 수
	 * 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
	 * */
	public static int solution04(int[] array, int n) {
		int answer = 0;
		int min = Integer.MAX_VALUE;
		
		for(int num : array) {
			int minus = (int)Math.abs(n-num);
			if(minus < min) {
				min = minus;
				answer = num;
			}else if(minus == min){
                if(answer > num) answer = num;
            }
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws Exception{
		//code 1
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		System.out.println(solution01(id_pw, db));
		
		
		//code 2
		int[] array = {1, 2, 3, 3, 3, 4};
		System.out.println(solution02(array));
		
		
		//code 3
		int[] numbers = {0, 31, 24, 10, 1, 9};
		System.out.println(solution03(numbers));
		
		
		//code4
		int[] array2 = {3, 10, 28};
		int n = 20;
		System.out.println(solution04(array2, n));
	}
}
