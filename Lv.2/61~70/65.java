class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] map = new int[rows][columns];
        
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                map[i][j] = num++;
            }
        }
        
        for (int j = 0; j < queries.length; j++) {
            int startX = queries[j][0] - 1;
            int startY = queries[j][1] - 1;
            int endX = queries[j][2] - 1;
            int endY = queries[j][3] - 1;
            
            int min = Integer.MAX_VALUE;
            num = map[startX][startY];
            
            for (int i = startY; i < endY; i++) {
                int tmp = num;
                num = map[startX][i+1];
                map[startX][i+1] = tmp;
                min = Math.min(min, tmp);
            }
            
            for (int i = startX; i < endX; i++) {
                int tmp = num;
                num = map[i+1][endY];
                map[i+1][endY] = tmp;
                min = Math.min(min, tmp);
            }
            
            for (int i = endY; i > startY; i--) {
                int tmp = num;
                num = map[endX][i-1];
                map[endX][i-1] = tmp;
                min = Math.min(min, tmp);
            }
            
            for (int i = endX; i > startX; i--) {
                int tmp = num;
                num = map[i-1][startY];
                map[i-1][startY] = tmp;
                min = Math.min(min, tmp);
            }
            answer[j] = min;
        }
        
        return answer;
    }
}