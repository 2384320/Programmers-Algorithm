import java.util.*;

class Solution {
    private int[] start;
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int length = balls.length;
        int[] answer = new int[length];
        start = new int[] {startX, startY};
        
        for (int i = 0; i < length; i++) {
            answer[i] = Integer.MAX_VALUE;
            List<int[]> ball = new ArrayList<>();
            int x = balls[i][0];
            int y = balls[i][1];
            
            if (!(x == startX && y < startY))
                ball.add(new int[] {x, -y});
            if (!(x == startX && y > startY))
                ball.add(new int[] {x, 2 * n - y});
            if (!(y == startY && x < startX))
                ball.add(new int[] {-x, y});
            if (!(y == startY && x > startX))
                ball.add(new int[] {2 * m - x, y});
            
            for (int[] b : ball) {
                answer[i] = Math.min(answer[i],
                                    getDistance(b));
            }
        }
        return answer;
    }
    
    private int getDistance(int[] end) {
        return (int)Math.pow(Math.abs(start[0] - end[0]), 2)
            + (int)Math.pow(Math.abs(start[1] - end[1]), 2);
    }
}