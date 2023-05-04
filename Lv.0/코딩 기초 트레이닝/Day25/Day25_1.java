class Solution {
    public int[][] solution(int n) {
        int[] moveX = {0, 1, 0, -1};
        int[] moveY = {1, 0, -1, 0};
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        
        int moveIdx = 0;
        int idx = 1;
        int row = 0;
        int col = 0;
        
        answer[0][0] = idx++;
        visited[0][0] = true;
        while (idx <= Math.pow(n, 2)) {
            int nRow = row + moveX[moveIdx];
            int nCol = col + moveY[moveIdx];
            
            if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < n) {
                if (!visited[nRow][nCol]) {
                    visited[nRow][nCol] = true;
                    answer[nRow][nCol] = idx++;
                    row = nRow;
                    col = nCol;
                    continue;
                }
            }
            moveIdx = (moveIdx + 1) % 4;
        }
        return answer;
    }
}