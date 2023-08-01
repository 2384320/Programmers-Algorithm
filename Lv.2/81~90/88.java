import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        int sortCol = col - 1;
        Arrays.sort(data, (e1, e2) -> {
            if (e1[sortCol] == e2[sortCol]) return e2[0] - e1[0];
            return e1[sortCol] - e2[sortCol];
        });
        
        int length = data[0].length;
        for (int i = row_begin - 1; i < row_end; i++) {
            int mod = i + 1;
            int d = 0;
            for (int j = 0; j < length; j++) {
                d += data[i][j] % mod;
            }
            answer = answer ^ d;
        }
        return answer;
    }
}