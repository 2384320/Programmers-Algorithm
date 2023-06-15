// bfs
import java.util.*;

class Solution {
    private int numberOfArea, maxSizeOfOneArea;
    private int[] moveX = {0, 0, 1, -1};
    private int[] moveY = {1, -1, 0, 0};
    private boolean[][] visited;
    
    public int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] || picture[i][j] == 0) continue;
                maxSizeOfOneArea = Math.max(bfs(i, j, m, n, picture[i][j], picture), maxSizeOfOneArea);
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    private int bfs(int x, int y, int m, int n, int currentColor, int[][] picture) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;
        numberOfArea++;
        int count = 1;
        
        while (!queue.isEmpty()) {
            x = queue.peek()[0];
            y = queue.peek()[1];
            queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = x + moveX[i];
                int ny = y + moveY[i];
                
                if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                if (visited[nx][ny]) continue;
                if (currentColor != picture[nx][ny]) continue;
                
                queue.offer(new int[] {nx, ny});
                visited[nx][ny] = true;
                count++;
            }
        }
        return count;
    }
}

// dfs
import java.util.*;

class Solution {
    private int numberOfArea, maxSizeOfOneArea, count;
    private int[] moveX = {0, 0, 1, -1};
    private int[] moveY = {1, -1, 0, 0};
    private boolean[][] visited;
    
    public int[] solution(int m, int n, int[][] picture) {
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count = 1;
                if (visited[i][j] || picture[i][j] == 0) continue;
                numberOfArea++;
                dfs(i, j, m, n, picture[i][j], picture);
                maxSizeOfOneArea = Math.max(count, maxSizeOfOneArea);
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    private void dfs(int x, int y, int m, int n, int currentColor, int[][] picture) {
        if (visited[x][y]) return;
        visited[x][y] = true;
        
        for (int i = 0; i < 4; i++) {
            int nx = x + moveX[i];
            int ny = y + moveY[i];
            
            if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
            if (visited[nx][ny]) continue;
            if (currentColor != picture[nx][ny]) continue;
            
            count++;
            dfs(nx, ny, m, n, currentColor, picture);
        }
    }
}