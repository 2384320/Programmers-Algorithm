class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] result = new int[board.length][board[0].length];
        
        x: for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    result[i][j] = 1;
                    int row_end = board.length - 1;
                    int col_end = board[0].length - 1;
                    
                    if (row_end == 0 && col_end == 0) break x;
                    if (i == 0 && j == 0) { // 0, 0
                        result[i+1][j] = 1;
                        result[i][j+1] = 1;
                        result[i+1][j+1] = 1;
                    } else if (i == row_end && j == 0) { // 끝, 0
                        result[i-1][j] = 1;
                        result[i][j+1] = 1;
                        result[i-1][j+1] = 1;
                    } else if (i == row_end && j == col_end) { // 끝, 끝
                        result[i-1][j] = 1;
                        result[i][j-1] = 1;
                        result[i-1][j-1] = 1;
                    } else if (i == 0 && j == col_end) { // 0, 끝
                        result[i][j-1] = 1;
                        result[i+1][j] = 1;
                        result[i+1][j-1] = 1;
                    } else if (i == 0 && j != 0 && j != col_end) { // 가로만 0
                        result[i][j-1] = 1;
                        result[i][j+1] = 1;
                        result[i+1][j-1] = 1;
                        result[i+1][j] = 1;
                        result[i+1][j+1] = 1;
                    } else if (i == row_end && j != 0 && j != col_end) { // 가로만 끝
                        result[i][j-1] = 1;
                        result[i][j+1] = 1;
                        result[i-1][j-1] = 1;
                        result[i-1][j] = 1;
                        result[i-1][j+1] = 1;
                    } else if (i != 0 && i != row_end && j == 0) { // 세로만 0
                        result[i-1][j] = 1;
                        result[i+1][j] = 1;
                        result[i-1][j+1] = 1;
                        result[i][j+1] = 1;
                        result[i+1][j+1] = 1;
                    } else if (i != 0 && i != row_end && j == col_end) { // 세로만 끝
                        result[i+1][j] = 1;
                        result[i-1][j] = 1;
                        result[i+1][j-1] = 1;
                        result[i][j-1] = 1;
                        result[i-1][j-1] = 1;
                    } else {
                        result[i+1][j] = 1;
                        result[i-1][j] = 1;
                        result[i+1][j-1] = 1;
                        result[i][j-1] = 1;
                        result[i-1][j-1] = 1;
                        result[i+1][j+1] = 1;
                        result[i][j+1] = 1;
                        result[i-1][j+1] = 1;
                    }
                }
            }
        }
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (result[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}