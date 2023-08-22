import java.util.*;

class Solution {
    private int height, width;
    private int[] moveX = {0, 0, 1, -1};
    private int[] moveY = {1, -1, 0, 0};
    private char[][] miro;
    
    public int solution(String[] maps) {
        int answer = 0;
        height = maps.length;
        width = maps[0].length();
        miro = new char[height][width];
        
        int[] startSpot = new int[2];
        int[] leverSpot = new int[2];
        int[] endSpot = new int[2];
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                char ch = maps[i].charAt(j);
                if (ch == 'S') {
                    startSpot[0] = i;
                    startSpot[1] = j;
                } else if (ch == 'L') {
                    leverSpot[0] = i;
                    leverSpot[1] = j;
                } else if (ch == 'E') {
                    endSpot[0] = i;
                    endSpot[1] = j;
                }
                miro[i][j] = ch;
            }
        }
        
        int startToLever = bfs(startSpot, leverSpot);
        if (startToLever == -1) return -1;
        int leverToEnd = bfs(leverSpot, endSpot);
        if (leverToEnd == -1) return -1;

        return startToLever + leverToEnd;
    }
    
    private int bfs(int[] start, int[] end) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {start[0], start[1], 0});
        boolean[][] visited = new boolean[height][width];
        visited[start[0]][start[1]] = true;
        
        char endCh = miro[end[0]][end[1]];
        
        while (!queue.isEmpty()) {
            int[] spot = queue.poll();
            
            if (miro[spot[0]][spot[1]] == endCh) return spot[2];
            
            for (int i = 0; i < 4; i++) {
                int nx = moveX[i] + spot[0];
                int ny = moveY[i] + spot[1];
                
                if (nx < 0 || ny < 0 || nx >= height || ny >= width) continue;
                if (visited[nx][ny] || miro[nx][ny] == 'X') continue;
                
                visited[nx][ny] = true;
                queue.offer(new int[] {nx, ny, spot[2] + 1});
            }
        }
        
        return -1;
    }
}