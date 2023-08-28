import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        int count = line.length;
        List<long[]> list = new ArrayList<>();
        
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                double a = line[i][0];
                double b = line[i][1];
                double e = line[i][2];
                
                double c = line[j][0];
                double d = line[j][1];
                double f = line[j][2];
                
                if (a * d - b * c == 0)
                    continue;
                double x = (b * f - e * d) / (a * d - b * c);
                double y = (e * c - a * f) / (a * d - b * c);
                
                if ((long) x == x && (long) y == y)
                    list.add(new long[] {(long) x, (long) y});
            }
        }
        
        long[] x = new long[2];
        long[] y = new long[2];
        
        x[0] = Long.MAX_VALUE;
        x[1] = Long.MIN_VALUE;
        y[0] = Long.MAX_VALUE;
        y[1] = Long.MIN_VALUE;
        
        for (int i = 0; i < list.size(); i++) {
            x[0] = Math.min(x[0], list.get(i)[0]);
            x[1] = Math.max(x[1], list.get(i)[0]);
            y[0] = Math.min(y[0], list.get(i)[1]);
            y[1] = Math.max(y[1], list.get(i)[1]);
        }
        
        long X, Y = 0L;
        X = x[1] - x[0] + 1;
        Y = y[1] - y[0] + 1;
        
        String[] answer = new String[(int) Y];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = "";
            for (int j = 0; j < (int) X; j++) {
                answer[i] += ".";
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            int nx = (int) (list.get(i)[0] - x[0]);
            int ny = (int) (y[1] - list.get(i)[1]);
            answer[ny] = answer[ny].substring(0, nx) + "*" + answer[ny].substring(nx + 1);
        }
        return answer;
    }
}