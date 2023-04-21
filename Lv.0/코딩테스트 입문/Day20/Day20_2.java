import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int max_x = board[0]/2, max_y = board[1]/2, min_x = -board[0]/2, min_y = -board[1]/2;
        
        for (String key : keyinput) {
            switch(key) {
                case "left":
                    if (answer[0] - 1 >= min_x) answer[0]--;
                    break;
                case "right":
                    if (answer[0] + 1 <= max_x) answer[0]++;
                    break;
                case "down":
                    if (answer[1] - 1 >= min_y) answer[1]--;
                    break;
                case "up":
                    if (answer[1] + 1 <= max_y) answer[1]++;
                    break;
            }
        }
        return answer;
    }
}