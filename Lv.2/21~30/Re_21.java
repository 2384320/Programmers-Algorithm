class Solution {
    private int answer;
    private int[] chess;
    public int solution(int n) {
        answer = 0;
        chess = new int[n];
        
        dfs(0);
        return answer;
    }
    
    private void dfs(int depth) {
        if (depth == chess.length) {
            answer++;
            return;
        }
        
        for (int i = 0; i < chess.length; i++) {
            chess[depth] = i;
            if (isPossible(depth)) dfs(depth + 1);
        }
    }
    
    private boolean isPossible(int num) {
        for (int i = 0; i < num; i++) {
            if (chess[i] == chess[num]) return false;
            else if (Math.abs(num - i) == Math.abs(chess[num] - chess[i])) return false;
        }
        return true;
    }
}