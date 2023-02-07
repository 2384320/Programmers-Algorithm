import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        for (int i = 1; i <= 2001; i++) {
            if (i > max) {
                if (min + max > i) answer++;
            } else if (min + i > max) answer++;
        }
        
        return answer;
    }
}