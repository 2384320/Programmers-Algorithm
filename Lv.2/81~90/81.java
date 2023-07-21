import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i <= order.length; i++) {
            queue.offer(i);
        }
        
        for (int o : order) {
            if (!stack.isEmpty()) {
                if (stack.peek() == o) {
                    stack.pop();
                    answer++;
                    continue;
                }
            }
            
            while (!queue.isEmpty() && queue.peek() != o) {
                stack.add(queue.poll());
            }
            
            if (queue.isEmpty()) break;

            queue.poll();
            answer++;
        }
        
        return answer;
    }
}