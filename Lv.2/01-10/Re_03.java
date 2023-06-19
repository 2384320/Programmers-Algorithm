import java.util.*;

class Solution {
    private int[] moveX = {0, 0, 1, -1};
    private int[] moveY = {1, -1, 0, 0};
    private int[][] visited;
    
    public int solution(int[][] maps) {
        visited = new int[maps.length][maps[0].length];
        int answer = bfs(0, 0, maps);
        return answer == 0 ? -1 : answer;
    }
    
    private int bfs(int x, int y, int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = 1;
        
        while (!queue.isEmpty()) {
            x = queue.peek()[0];
            y = queue.peek()[1];
            queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = x + moveX[i];
                int ny = y + moveY[i];
                
                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length) continue;
                if (visited[nx][ny] != 0 || maps[nx][ny] == 0) continue;
                
                visited[nx][ny] = visited[x][y] + 1;
                queue.offer(new int[] {nx, ny});
            }
        }
        return visited[maps.length - 1][maps[0].length - 1];
    }
}