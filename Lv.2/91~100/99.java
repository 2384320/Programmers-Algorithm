class Solution {
    public int solution(String[] board) {        
        int firstCount = 0;
        int secondCount = 0;
        
        for (String b : board) {
            char[] tictactoe = b.toCharArray();
            
            for (int i = 0; i < 3; i++) {
                if (tictactoe[i] == 'O')
                    firstCount++;
                else if (tictactoe[i] == 'X')
                    secondCount++;
            }
        }
                
        boolean isFirstBingo = false;
        boolean isSecondBingo = false;
        for (int i = 0; i < 3; i++) {
            if (board[i].equals("OOO"))
                isFirstBingo = true;
            else if (board[i].equals("XXX"))
                isSecondBingo = true;
            
            if (board[0].charAt(i) == board[1].charAt(i)
                && board[1].charAt(i) == board[2].charAt(i)) {
                if (board[0].charAt(i) == 'O')
                    isFirstBingo = true;
                else if (board[0].charAt(i) == 'X')
                    isSecondBingo = true;
            }
        }
        
        if (board[0].charAt(0) == board[1].charAt(1)
            && board[1].charAt(1) == board[2].charAt(2)) {
            if (board[0].charAt(0) == 'O')
                isFirstBingo = true;
            else if (board[0].charAt(0) == 'X')
                isSecondBingo = true;
        }
        
        if (board[0].charAt(2) == board[1].charAt(1)
            && board[1].charAt(1) == board[2].charAt(0)) {
            if (board[0].charAt(2) == 'O')
                isFirstBingo = true;
            else if (board[0].charAt(2) == 'X')
                isSecondBingo = true;
        }
        
        if (firstCount == secondCount) {
            if ((!isFirstBingo && !isSecondBingo)
                || (!isFirstBingo && isSecondBingo))
                return 1;
        } else if (firstCount == secondCount + 1) {
            if ((!isFirstBingo && !isSecondBingo)
                || (isFirstBingo && !isSecondBingo))
                return 1;
        }
        return 0;
    }
}