class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        // lottos의 0 개수 카운팅
        int countScribble = 0;
        // lottos에 win_nums와 같은 숫자 개수 카운팅
        int countWin = 0;

        for (int minwu : lottos) {
            // lottos에 0이 발견되면 countScribble++
            if (minwu == 0) {
                countScribble++;
                continue;
            }
            
            // lottos에 win_nums와 같은 숫자 발견되면 countWin++
            for (int win : win_nums) {
                if (win == minwu) {
                    countWin++;
                    break;
                }
            }
        }
        
        // 최고 순위 = 같은 숫자 + 낙서 개수
        int countHigh = countWin + countScribble;
        // 만약 각 카운팅이 2보다 크면 7에서 뺀 값을 출력하도록 하고,
        // 그 이외의 값은 6(낙점)을 출력하도록 함.
        answer[0] = countHigh >= 2 ? 7 - countHigh : 6;
        answer[1] = countWin >= 2 ? 7 - countWin : 6;
        return answer;
    }
}