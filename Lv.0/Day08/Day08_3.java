import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Arrays.fill(answer, 1);
        
        for (int i = 0; i < emergency.length-1; i++) {
            for (int j = i+1; j < emergency.length; j++) {
                if (emergency[i] >= emergency[j]) answer[j]++;
                else answer[i]++;
            }
        }
        
        return answer;
    }
}