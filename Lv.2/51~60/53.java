import java.util.*;

class Solution {
    private static final int mapLength = 11;
    public int solution(String dirs) {
        int answer = 0;
        int[][] spot = {{5, 5}, {5, 5}};
        HashSet<String> hs = new HashSet<String>();
        
        for (char d : dirs.toCharArray()) {
            switch (d) {
                case 'U':
                    if (spot[1][1] - 1 < 0) break;
                    spot[1][1]--;
                    break;
                case 'D':
                    if (spot[1][1] + 1 >= mapLength) break;
                    spot[1][1]++;
                    break;
                case 'L':
                    if (spot[1][0] - 1 < 0) break;
                    spot[1][0]--;
                    break;
                case 'R':
                    if (spot[1][0] + 1 >= mapLength) break;
                    spot[1][0]++;
                    break;
            }
            hs.add("" + spot[0][0] + spot[0][1] + spot[1][0] + spot[1][1]);
            hs.add("" + spot[1][0] + spot[1][1] + spot[0][0] + spot[0][1]);
            
            spot[0][0] = spot[1][0];
            spot[0][1] = spot[1][1];
        }
        
        answer = hs.size() / 2;
        return answer;
    }
}