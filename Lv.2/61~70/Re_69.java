import java.util.*;

class Solution {
    private int[] moveX = {1, 0, -1, 0};
    private int[] moveY = {0, 1, 0, -1};
    private boolean[][][] visited;
    public int[] solution(String[] grid) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        
        visited = new boolean[grid.length][grid[0].length()][4];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                for (int k = 0; k < 4; k++) {
                    if (visited[i][j][k]) continue;
                    result.add(bfs(grid, i, j, k));
                }
            }
        }
        Collections.sort(result);
        answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    private int bfs(String[] grid, int x, int y, int d) {
        int count = 0;
        
        while (!visited[x][y][d]) {
            count++;
            visited[x][y][d] = true;
            
            char ch = grid[x].charAt(y);
            if (ch == 'R') d = d == 0 ? 3 : d - 1;
            else if (ch == 'L') d = d == 3 ? 0 : d + 1;
            x = (x + moveX[d] + grid.length) % grid.length;
            y = (y + moveY[d] + grid[0].length()) % grid[0].length();
            
        }
        return count;
    }
}