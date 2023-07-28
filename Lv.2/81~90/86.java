import java.util.*;

class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        List<Long> list = new ArrayList<>();
        long num = 0;
        while (num <= d) {
            list.add(num * num);
            num += k;
        }
        
        long dist = (long)Math.pow(d, 2);
        for (long a : list) {
            long b = (long)Math.sqrt(dist - a) / k;
            answer += b + 1;
        }
        return answer;
    }
}