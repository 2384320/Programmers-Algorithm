import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (e1, e2) -> {
            if (e1[1] == e2[1])
                return e1[0] - e2[0];
            return e1[1] - e2[1];
        });
        
        int x = 0;
        for (int i = 0; i < targets.length; i++) {
            if (x <= targets[i][0]) {
                x = targets[i][1];
                answer++;
            }
        }
        return answer;
    }
}