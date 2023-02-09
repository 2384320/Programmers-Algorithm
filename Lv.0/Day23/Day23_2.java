import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] result = new double[score.length];
        Arrays.fill(answer, 1);
        
        for (int i = 0; i < score.length; i++) {
            result[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] < result[j]) answer[i]++;
                else if (result[i] > result[j]) answer[j]++;
            }
        }
        
        return answer;
    }
}