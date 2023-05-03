import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (stack.peek() == ch) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        if (stack.isEmpty()) answer = 1;

        return answer;
    }
}