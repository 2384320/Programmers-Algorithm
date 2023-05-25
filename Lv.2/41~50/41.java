import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        boolean enoughScoville = false;
        
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        
        while (pq.size() >= 2) {
            if (pq.peek() >= K) {
                enoughScoville = true;
                break;
            }
            int num1 = pq.poll();
            int num2 = pq.poll();
            pq.add(num1 + (num2 * 2));
            answer++;
        }
        
        if (pq.peek() < K && !enoughScoville) answer = -1;
        return answer;
    }
}