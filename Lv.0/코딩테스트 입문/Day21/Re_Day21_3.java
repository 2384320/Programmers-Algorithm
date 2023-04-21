import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        for (int i = 1; i < sides[0] + sides[1]; i++) {
            if (i > max) {
                if (min + max > i) answer++;
            }
            else if (min + i > max) answer++;
        }
        return answer;
    }
}
// sides의 원소 둘을 더한 최댓값 대신 sides[0] + sides[1]를 더한 값까지만 반복문이 반복되도록 함.