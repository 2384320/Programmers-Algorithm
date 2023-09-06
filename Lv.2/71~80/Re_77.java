import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < queue1.length; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }
        
        int limit = queue1.length * 4;
        
        long half = (sum1 + sum2) / 2;
        while (sum1 != sum2) {
            if (sum1 > sum2) {
                sum1 -= q1.peek();
                sum2 += q1.peek();
                q2.offer(q1.poll());
            } else {
                sum1 += q2.peek();
                sum2 -= q2.peek();
                q1.offer(q2.poll());
            }
            if (answer > limit) return -1;
            answer++;
        }

        return answer;
    }
}