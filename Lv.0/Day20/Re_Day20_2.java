import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int max_x = board[0]/2, max_y = board[1]/2, min_x = -board[0]/2, min_y = -board[1]/2;
        
        for (String key : keyinput) {
            if (key.equals("left") && answer[0] - 1 >= min_x) 
            else if (key.equals("right") && answer[0] + 1 <= max_x)
            else if (key.equals("down") && answer[1] - 1 >= min_y)
            else if (key.equals("up") && answer[1] + 1 >= max_y)
            
        }
        return answer;
    }
}
// switch 문을 if 문으로 바꿈.