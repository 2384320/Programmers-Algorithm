import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[] {priorities[i], i});
        }
        
        while (!queue.isEmpty()) {
            boolean state = true;
            int pri = queue.peek()[0];
            int lo = queue.peek()[1];
            queue.poll();

            Iterator<int[]> it = queue.iterator();
            while (it.hasNext()) {
                if (pri < it.next()[0]) {
                    queue.offer(new int[] {pri, lo});
                    state = false;
                    break;
                }
            }

            if (state) {
                answer++;
                if (lo == location) break;
            }
        }
        
        return answer;
    }
}