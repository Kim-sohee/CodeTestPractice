package algorithmJava;

/*프로그래머스 0단계 문제 풀이*/
public class Programmers1113 {
	/*[문제] 외계행성의 나이
	 * 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 
	 * 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. 
	 * a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
	 * 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
	 * */
	public static String solution01(int age) {
		String answer = "";
		int[] arr = String.valueOf(age).chars().map(c->c-'0').toArray();

		for(int num : arr) {
			answer += String.valueOf((char)(num+'a'));
		}
		
		return answer;
	}
	
	/*[문제] 옷가게 할인 받기
	 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
	 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
	 * */
	public static int solution02(int price) {
		if (price >= 500000) {
            return price * 80 / 100; // 20% 할인
        } else if (price >= 300000) {
            return price * 90 / 100; // 10% 할인
        } else if (price >= 100000) {
            return price * 95 / 100; // 5% 할인
        } else {
            return price;
        }
	}
	
	
	/*[문제] 피자 나눠 먹기(2)
	 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
	 * n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	 * */
	public static int solution03(int n) {
		int answer = (n*6) / gcd(6, n);
		return answer/6;
	}
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	/*[문제] 주사위의 개수
	 * 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 
	 * 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 
	 * 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요
	 * */
	public static int solution04(int[] box, int n) {
		int answer = 1;
		for(int num : box) {
			answer *= (int)Math.floor(num/(n+0.0));
		}
		return answer;
	}
	
	
	/*[문제] 팩토리얼
	 * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 
	 * 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
	 * */
	public static int solution05(int n) {
		int answer = 1;
		int max = 1;
		
		while(true) {
			answer *= max;
			if(answer > n) break;
			max++;
		}
		return max-1;
	}
	
	public static void main(String[] args) {
		//code 1
		System.out.println(solution01(23));
		
		
		//code 2
		System.out.println(solution02(1000000));
		
		
		//code 3
		System.out.println(solution03(10));
		
		
		//code 4
		int[] box = {10, 8, 6};
		System.out.println(solution04(box, 3));
		
		
		//code 5
		System.out.println("total: "+solution05(3628800));
	}
}
