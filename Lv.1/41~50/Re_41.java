import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> pull = new Stack<>();
        int doll, answer = 0;
        
        for (int moveLine : moves) {
            doll = 0;
            
            for (int i = 0; i < board.length; i++) {
                if (board[i][moveLine - 1] != 0) {
                    doll = board[i][moveLine - 1];
                    board[i][moveLine - 1] = 0;
                    break;
                }
            }
            if (doll == 0) continue;
            
            if (!pull.isEmpty()) {
                if (pull.peek() == doll) {
                    answer += 2;
                    pull.pop();
                    continue;
                }
            }
            pull.push(doll);
        }
        
        return answer;
    }
}