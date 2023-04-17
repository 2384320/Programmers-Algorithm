import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.add(ch);
            else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else stack.add(ch);
            }
        }
        
        if (!stack.isEmpty()) answer = false;

        return answer;
    }
}