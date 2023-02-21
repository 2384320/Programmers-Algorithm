import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failureRate = new double[N];
        int challengePlayer = 0, failurePlayer = 0, max = 0;

        for (int i = 0; i < N; i++) {
            challengePlayer = 0;
            failurePlayer = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] < i + 1) continue;
                challengePlayer++;
                if (stages[j] == i + 1) failurePlayer++;
            }
            if (challengePlayer == 0) {
                failureRate[i] = 0.0;
                continue;
            }
            failureRate[i] = (double)failurePlayer/challengePlayer;
        }
                
        for (int i = 0; i < N; i++) {
            answer[i] = i+1;
        }

        int temp = 0;
        double tempDouble = 0.0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (failureRate[i] < failureRate[j] || (failureRate[i] == failureRate[j] && answer[i] > answer[j])) {
                    tempDouble = failureRate[i];
                    failureRate[i] = failureRate[j];
                    failureRate[j] = tempDouble;
                    
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}