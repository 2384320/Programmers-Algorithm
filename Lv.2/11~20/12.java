import java.util.*;

class Solution {
    public static int[] solution(long begin, long end) {
        int[] answer = new int[(int)(end - begin + 1)];

        for (int i = (int)begin, idx = 0; i <= end; i++) {
            answer[idx++] = divisor(i);
        }
        return answer;
    }
    
    public static int divisor(int num) {
        if (num == 1) return 0;

        List<Integer> list = new ArrayList<>();        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                list.add(i);
                if (num / i <= 10000000) return num / i;
            }
        }
        
        if (!list.isEmpty()) return list.get(list.size() - 1);
        return 1;
    }
}