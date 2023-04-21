import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] result = new int[202];
        
        for (int i = 0; i < lines.length; i++) {
            for (int count = -100; count <= 100; count++) {
                if (lines[i][0] < count && lines[i][1] >= count) result[count+100]++;
						} 
        }
        for (int count = 0; count <= 201; count++) {
            if (result[count] >= 2) {
                answer++;
            }
        }
        
        return answer;
    }
}