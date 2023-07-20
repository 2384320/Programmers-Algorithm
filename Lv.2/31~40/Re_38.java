import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < stack.peek()[0]) {
                int fall = stack.pop()[1];
                answer[fall] = i - fall;
            }
            stack.push(new int[] {prices[i], i});
        }
        
        while (!stack.isEmpty()) {
            int[] price = stack.pop();
            answer[price[1]] = prices.length - price[1] - 1;
        }        
        return answer;
    }
}