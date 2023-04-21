import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int lengthX = board.length, lengthY = board[0].length;

        // 위험지역
        for (int i = 0; i < lengthX; i++) {
            for (int j = 0; j < lengthY; j++) {
                if (board[i][j] == 1) setDangerousArea(board, i, j);
            }
        }

        // 안전지역
        for (int i = 0; i < lengthX; i++) {
            for (int j = 0; j < lengthY; j++) {
                if (board[i][j] == 0) answer++;
            }
        }
        return answer;
    }
    public void setDangerousArea(int[][] board, int x, int y) {
        int dangerX = 0, dangerY = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                dangerX = x + i; dangerY = y + j;
                if (dangerX <= -1 || dangerY <= -1 || dangerX >= board.length || dangerY >= board[0].length) continue;
                if (board[dangerX][dangerY] == 0) board[dangerX][dangerY] = -1;
            }
        }
    }
}
// 깔끔하게 정리하는 위주로 했음.
// board 배열의 값이 지뢰가 매설됨을 나타내는 1이라면 setDangerousArea 실행
// 주위 8칸의 배열 값을 -1로 바꿔주는데, 이때 배열을 넘는 값을 지니게 된다면 continue;
// -1을 표시한 지역과 1인 지역을 제외한 0이 표시된 지역을 카운팅함.