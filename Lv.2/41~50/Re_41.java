import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>();
        
        for (int s : scoville) {
            pq.offer(s);
        }
        
        while (pq.size() >= 2) {
            if (pq.peek() >= K) break;
            int num1 = pq.poll();
            int num2 = pq.poll();    
            pq.offer(num1 + (num2 * 2));
            answer++;
        }
        
        if (pq.peek() < K) answer = -1;
        return answer;
    }
}