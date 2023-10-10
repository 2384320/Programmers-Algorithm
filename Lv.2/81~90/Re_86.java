import java.util.*;

class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        long dist = (long)Math.pow(d, 2);
        long num = 0;
        
        while (num <= d) {
            long b = (long)Math.sqrt(dist - (num * num)) / k;
            num += k;
            answer += b + 1;
        }
        return answer;
    }
}