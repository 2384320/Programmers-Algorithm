import java.util.*;

class Solution {
    private int answer;
    private boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];
        explore(dungeons, k, 0);
        return answer;
    }
    
    private void explore(int[][] dungeons, int k, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                explore(dungeons, k - dungeons[i][1], count + 1);
                visited[i] = false;
            }
        }
        
        if (answer < count) answer = count;
    }
}