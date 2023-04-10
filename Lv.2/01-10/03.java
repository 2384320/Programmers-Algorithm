import java.util.*;

class Solution {
    public boolean[][] visited;
    public int[][] count;
    public int[][] m;
    public int[] moveX = {0, 0, 1, -1};
    public int[] moveY = {1, -1, 0, 0};
    
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        count = new int[maps.length][maps[0].length];
        m = maps;
        
        count[maps.length-1][maps[0].length-1] = -1;
        bfs(0, 0);
        return count[maps.length-1][maps[0].length-1];
    }
    
    public void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        count[x][y] = 1;
        
        while (!queue.isEmpty()) {
            x = queue.peek()[0];
            y = queue.peek()[1];
            queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = x + moveX[i];
                int ny = y + moveY[i];
                
                if (nx < 0 || nx >= m.length || ny < 0 || ny >= m[0].length || m[nx][ny] == 0) continue;
                if (!visited[nx][ny]) {
                    count[nx][ny] = count[x][y] + 1;
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}