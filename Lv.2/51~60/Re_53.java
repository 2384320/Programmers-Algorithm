import java.util.*;

class Solution {
    private static final int MINUS_RANGE = -5;
    private static final int PLUS_RANGE = 5;
    
    public int solution(String dirs) {
        int[][] spot = new int[][] {{0, 0}, {0, 0}};
        HashSet<String> hs = new HashSet<>();
        
        for (char d : dirs.toCharArray()) {
            if (d == 'U') {
                if (spot[0][1] >= PLUS_RANGE) continue;
                spot[0][1]++;
            } else if (d == 'D') {
                if (spot[0][1] <= MINUS_RANGE) continue;
                spot[0][1]--;
            } else if (d == 'R') {
                if (spot[0][0] >= PLUS_RANGE) continue;
                spot[0][0]++;
            } else if (d == 'L') {
                if (spot[0][0] <= MINUS_RANGE) continue;
                spot[0][0]--;
            }
            
            hs.add("" + spot[0][0] + spot[0][1] + spot[1][0] + spot[1][1]);
            hs.add("" + spot[1][0] + spot[1][1] + spot[0][0] + spot[0][1]);
            
            spot[1][0] = spot[0][0];
            spot[1][1] = spot[0][1];
        }
        return hs.size() / 2;
    }
}