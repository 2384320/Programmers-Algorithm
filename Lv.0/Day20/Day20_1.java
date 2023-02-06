class Solution {
    public int solution(int[][] dots) {
        int answer = 1;
        int row = 0, col = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                int x = Math.max(dots[i][0], dots[j][0]) - Math.min(dots[i][0], dots[j][0]);
                int y = Math.max(dots[i][1], dots[j][1]) - Math.min(dots[i][1], dots[j][1]);
            
                row = Math.max(x, row);
                col = Math.max(y, col);
            }
        }
        answer = row * col;
        return answer;
    }
}