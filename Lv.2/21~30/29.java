import java.util.*;

class Solution {
    int M, N;
    boolean check;
    char[][] map;
    boolean[][] visited;
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        check = true;
        M = m;
        N = n;
        map = new char[m][n];
        
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }
        
        while (check) {
            visited = new boolean[m][n];
            check = false;
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (map[i][j] == '#' || !is4Block(i, j)) continue;
                    visited[i][j] = true;
                    visited[i][j+1] = true;
                    visited[i+1][j] = true;
                    visited[i+1][j+1] = true;
                    check = true;
                }
            }
            answer += modify();
        }
        return answer;
    }
    
    private int modify() {
        int count = 0;
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j]) map[i][j] = '.';
            }
        }
        
        for (int i = 0; i < N; i++) {
            Queue<Character> queue = new LinkedList<>();
            for (int j = M - 1; j >= 0; j--) {
                if (map[j][i] == '.') count++;
                else queue.add(map[j][i]);
            }
            
            int idx = M - 1;
            while (!queue.isEmpty()) {
                map[idx--][i] = queue.poll();
            }
            for (int j = idx; j >= 0; j--) {
                map[j][i] = '#';
            }
        }
        
        return count;
    }
    
    private boolean is4Block(int y, int x) {
        char ch = map[y][x];
        if (ch == map[y+1][x] && ch == map[y][x+1] && ch == map[y+1][x+1]) return true;
        return false;
    }
}