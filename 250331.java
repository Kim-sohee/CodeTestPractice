// 1. [PCCE 기출문제] 9번/ 지폐접기 (lv.1)
/* 민수는 다양한 지폐를 수집하는 취미를 가지고 있습니다. 지폐마다 크기가 달라 지갑에 넣으려면 여러 번 접어서 넣어야 합니다. 예를 들어 지갑의 크기가 30 * 15이고 지폐의 크기가 26 * 17이라면 한번 반으로 접어 13 * 17 크기로 만든 뒤 90도 돌려서 지갑에 넣을 수 있습니다. 지폐를 접을 때는 다음과 같은 규칙을 지킵니다.
- 지폐를 접을 때는 항상 길이가 긴 쪽을 반으로 접습니다.
- 접기 전 길이가 홀수였다면 접은 후 소수점 이하는 버립니다.
- 접힌 지폐를 그대로 또는 90도 돌려서 지갑에 넣을 수 있다면 그만 접습니다.
지갑의 가로, 세로 크기를 담은 정수 리스트 wallet과 지폐의 가로, 세로 크기를 담은 정수 리스트 bill가 주어질 때, 지갑에 넣기 위해서 지폐를 최소 몇 번 접어야 하는지 return하도록 solution함수를 완성해 주세요.*/

class Solution1 {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        wallet = minMaxFilter(wallet);
        bill = minMaxFilter(bill);
        
        while(!(wallet[0] >= bill[0] && wallet[1] >= bill[1])){
            bill[0] = (int)(bill[0]/2);
            ++answer;
            bill = minMaxFilter(bill);
        }
        
        return answer;
    }
    
    public int[] minMaxFilter(int[] arr){
        int[] result = new int[2];
        result[0] = Math.max(arr[0], arr[1]);
        result[1] = Math.min(arr[0], arr[1]);
        
        return result;
    }
}

// 2. [PCCE 기출문제] 10번 / 공원 (lv.1)
/* 지민이는 다양한 크기의 정사각형 모양 돗자리를 가지고 공원에 소풍을 나왔습니다. 공원에는 이미 돗자리를 깔고 여가를 즐기는 사람들이 많아 지민이가 깔 수 있는 가장 큰 돗자리가 어떤 건지 확인하려 합니다.  
지민이가 가진 돗자리들의 한 변의 길이들이 담긴 정수 리스트 mats, 현재 공원의 자리 배치도를 의미하는 2차원 문자열 리스트 park가 주어질 때 지민이가 깔 수 있는 가장 큰 돗자리의 한 변 길이를 return 하도록 solution 함수를 완성해 주세요. 아무런 돗자리도 깔 수 없는 경우 -1을 return합니다. */
class Solution2 {
    public int solution(int[] mats, String[][] park) {
        int maxLen = maxSquareSize(park);
        
        int largest = 0;
        for(int len: mats){
            if(len <= maxLen){
                if(len > largest){
                    largest = len;
                }
            }
        }
        return largest;
    }

    public int maxSquareSize(String[][] park) {
        int rows = park.length;
        int cols = park[0].length;

        int [][] dp = new int[rows][cols];
        int maxLen = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(park[i][j].equals("-1")){
                    if(i==0 || j==0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    }
                    maxLen = Math.max(maxLen, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return maxLen;
    }
}