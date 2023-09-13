import java.util.*;

class Solution {
    public int solution(int[] order) {
        int count = 0;
        
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < order.length; i++) {
            stack.add(i+1);
            
            while (!stack.isEmpty()) {
                if (stack.peek() == order[count]) {
                    queue.offer(stack.pop());
                    count++;
                } else
                    break;
            }
        }
        
        return queue.size();
    }
}