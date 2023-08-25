import java.util.*;

class Solution {
    private boolean check;
    private int[] moveX = {0, 0, 1, -1};
    private int[] moveY = {1, -1, 0, 0};
    private char[][] placeCharArray;
    private boolean[][] visited;
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for (int i = 0; i < places.length; i++) {
            check = true;
            placeCharArray = new char[5][5];
            for (int j = 0; j < places[i].length; j++) {
                placeCharArray[j] = places[i][j].toCharArray();
            }
            
            for (int j = 0; j < placeCharArray.length; j++) {
                for (int k = 0; k < placeCharArray[j].length; k++) {
                    visited = new boolean[5][5];
                    if (placeCharArray[j][k] == 'P') bfs(j, k);
                    if (!check) break;
                }
                if (!check) break;
            }
            
            if (check) answer[i] = 1;
        }
        
        return answer;
    }
    
    private void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y, 0});
        
        while (!queue.isEmpty()) {
            x = queue.peek()[0];
            y = queue.peek()[1];
            int dist = queue.peek()[2];
            queue.poll();
            
            if (dist >= 2) continue;
            visited[x][y] = true;
            
            for (int i = 0; i < 4; i++) {
                int nx = moveX[i] + x;
                int ny = moveY[i] + y;
                
                if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;
                if (visited[nx][ny]) continue;
                
                if (placeCharArray[nx][ny] == 'O') queue.offer(new int[] {nx, ny, dist + 1});
                else if (placeCharArray[nx][ny] == 'P') {
                    check = false;
                    return;
                }
            }
        }
    }
}