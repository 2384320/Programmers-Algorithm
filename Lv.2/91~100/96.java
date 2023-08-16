import java.util.*;

class Solution {
    private int height, width;
    private int[] moveX = {0, 0, 1, -1};
    private int[] moveY = {1, -1, 0, 0};
    private boolean[][] visited;
    public int[] solution(String[] maps) {
        List<Integer> result = new ArrayList<>();
        
        height = maps.length;
        width = maps[0].length();
        visited = new boolean[height][width];
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (visited[i][j] || maps[i].charAt(j) == 'X') continue;
                result.add(bfs(i, j, maps));
            }
        }
        
        Collections.sort(result);
        int size = result.size();
        if (size == 0) return new int[] {-1};
        
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
    
    private int bfs(int x, int y, String[] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;
        int count = 0;
        
        while (!queue.isEmpty()) {
            x = queue.peek()[0];
            y = queue.peek()[1];
            queue.poll();
            count += maps[x].charAt(y) - '0';
            
            for (int i = 0; i < 4; i++) {
                int nx = x + moveX[i];
                int ny = y + moveY[i];
                
                if (nx < 0 || ny < 0 || nx >= height || ny >= width) continue;
                if (visited[nx][ny] || maps[nx].charAt(ny) == 'X') continue;
                visited[nx][ny] = true;
                queue.offer(new int[] {nx, ny});
            }
        }
        
        return count;
    }
}