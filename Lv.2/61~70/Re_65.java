class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int round = queries.length;
        int[] answer = new int[round];
        int[][] arr = new int[rows][columns];
        
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = count++;
            }
        }
        
        for (int i = 0; i < round; i++) {
            int startX = queries[i][0] - 1;
            int startY = queries[i][1] - 1;
            int endX = queries[i][2] - 1;
            int endY = queries[i][3] - 1;
            
            int min = Integer.MAX_VALUE;
            int num = arr[startX][startY];
            int tmp;
            
            for (int j = startY; j < endY; j++) {
                min = Math.min(min, num);
                tmp = arr[startX][j + 1];
                arr[startX][j + 1] = num;
                num = tmp;
            }
            
            for (int j = startX; j < endX; j++) {
                min = Math.min(min, num);
                tmp = arr[j + 1][endY];
                arr[j + 1][endY] = num;
                num = tmp;
            }
            
            for (int j = endY; j > startY; j--) {
                min = Math.min(min, num);
                tmp = arr[endX][j - 1];
                arr[endX][j - 1] = num;
                num = tmp;
            }
            
            for (int j = endX; j > startX; j--) {
                min = Math.min(min, num);
                tmp = arr[j - 1][startY];
                arr[j - 1][startY] = num;
                num = tmp;
            }
            answer[i] = min;
        }
        
        return answer;
    }
}