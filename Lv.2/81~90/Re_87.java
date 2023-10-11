import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int length = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>();
            pq.offer(enemy[i]);
            if (pq.size() > k)
                n -= pq.poll();
            if (n < 0)
                return i;
        }
        return length;
    }
}