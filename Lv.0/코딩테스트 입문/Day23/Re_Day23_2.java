import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> result = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int[] scoreArr : score) {
            result.add(scoreArr[0] + scoreArr[1]);
        }
        Collections.sort(result, Collections.reverseOrder());
        
        // 리스트에 둘의 합이 들어간 값 찾기
        // 찾으면 인덱스를 출력하므로 +1해주기기
        for (int i = 0; i < score.length; i++) {
            answer[i] = result.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}
// 과목 개수와 종목이 동일하기 때문에 굳이 (double) /2로 평균 구해줄 필요 없음.