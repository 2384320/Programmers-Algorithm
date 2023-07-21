import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;
        Queue<Integer> queue = new LinkedList<>();
        
        for (int p : priorities) {
            queue.offer(p);
        }
        
        Arrays.sort(priorities);
        int size = priorities.length - 1;
        
        while (!queue.isEmpty()) {
            int i = queue.poll();
            
            if (i == priorities[size - answer]) {
                answer++;
                l--;
                if (l < 0) break;
            } else {
                queue.offer(i);
                l--;
                if (l < 0) l = queue.size() - 1;
            }
        }
        
        return answer;
    }
}