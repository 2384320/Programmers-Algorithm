class Solution {
    public String[] arr = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        for (String bab : babbling) {
            answer += findBabbling(bab);
        }
        return answer;
    }

    public int findBabbling(String babbling) {
        for (String str : arr) {
            if (babbling.contains(str)) babbling = babbling.replaceFirst(str , "0");
        }
        if (babbling.contains("0")) babbling = babbling.replaceAll("0", "");
        
        if (babbling.equals("")) return 1;
        else return 0;
    }
}
// 옹알이 찾기 부분을 별도 함수로 옮김.
// 문자열을 감지하고 빠지다가 없던 옹알이를 만드는 경우가 있으므로
// replaceFirst를 사용해 다른 단어로 배치함.
