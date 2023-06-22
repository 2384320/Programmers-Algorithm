class Solution {
    private int N, score, moveIdx, max;
    private int[] answer;
    private int[][] arr;
    
    private int[] moveX = {1, 0, -1};
    private int[] moveY = {0, 1, -1};

    public int[] solution(int n) {
        N = n;
        score = 0;
        moveIdx = 0;
        
        for (int i = 1; i <= n; i++) {
            max += i;
        }
        answer = new int[max];
        arr = new int[n][n];
        
        snail(0, 0);
        
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                answer[idx++] = arr[i][j];
            }
        }
        return answer;
    }
    
    private void snail(int x, int y) {
        arr[x][y] = ++score;
        
        while (score < max) {
            int nx = x + moveX[moveIdx];
            int ny = y + moveY[moveIdx];
            
            if (nx < 0 || ny < 0 || nx >= N || nx < ny) {
                moveIdx = (moveIdx + 1) % 3;
                continue;
            }
            
            if (arr[nx][ny] > 0) {
                moveIdx = (moveIdx + 1) % 3;
                continue;
            }
            
            arr[nx][ny] = ++score;
            x = nx;
            y = ny;
        }
    }
}