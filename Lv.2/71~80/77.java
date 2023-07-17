import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        
        int limit = queue1.length * 4;
        
        for (int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }
        
        long half = (sum1 + sum2) / 2;
        while (sum1 != sum2) {
            if (half > sum1) {
                int poll = q2.poll();
                sum1 += poll;
                sum2 -= poll;
                q1.offer(poll);
            } else {
                int poll = q1.poll();
                sum1 -= poll;
                sum2 += poll;
                q2.offer(poll);
            }
            if (answer > limit) return -1;
            answer++;
        }
        
        return answer;
    }
}