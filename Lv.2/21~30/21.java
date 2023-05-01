import java.util.*;

class Solution {
    int count, N;
    int[] chess;
    boolean[] visited;
    public int solution(int n) {
        int answer = 0;
        count = 0;
        N = n;
        chess = new int[n];
        visited = new boolean[n];
        
        dfs(0);
        answer = count;
        return answer;
    }
    
    private void dfs(int depth) {
        if (depth == N) {
            count++;
            return;
        }
        
        for (int i = 0; i < N; i++) {
            chess[depth] = i;
            if (possibility(depth)) dfs(depth + 1);
        }
    }
    private boolean possibility(int num) {
        for (int i = 0; i < num; i++) {
            if (chess[i] == chess[num]) return false;
            else if (Math.abs(num - i) == Math.abs(chess[num] - chess[i])) return false;
        }
        return true;
    }
}