import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }
        
        boolean check = true;
        while (check) {
            check = false;
            boolean[][] visited = new boolean[m][n];
            
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (map[i][j] != '#' && isEqualsFourBlock(map, i, j)) {
                        visited[i][j] = true;
                        visited[i][j+1] = true;
                        visited[i+1][j] = true;
                        visited[i+1][j+1] = true;
                        check = true;
                    }
                }
            }
            answer += setBoard(map, visited, m, n);
        }
        
        return answer;
    }
    
    private boolean isEqualsFourBlock(char[][] map, int x, int y) {
        char ch = map[x][y];
        if (ch == map[x + 1][y]
            && ch == map[x + 1][y + 1]
            && ch == map[x][y + 1]) return true;
        return false;
    }
    
    private int setBoard(char[][] map, boolean[][] visited, int m, int n) {
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) map[i][j] = '.';
            }
        }
        
        for (int i = 0; i < n; i++) {
            Queue<Character> queue = new LinkedList<>();
            for (int j = m - 1; j >= 0; j--) {
                if (map[j][i] == '.') count++;
                else queue.offer(map[j][i]);
            }
            
            int idx = m - 1;
            while (!queue.isEmpty()) {
                map[idx--][i] = queue.poll();
            }
            for (int j = idx; j >= 0; j--) {
                map[j][i] = '#';
            }
        }
        
        return count;
    }
}