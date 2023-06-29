import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.substring(0, 1);
            Stack<Character> stack = new Stack<>();
            
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (stack.isEmpty() || ch == '(' || ch == '[' || ch == '{') stack.add(ch);
                else {
                    if (ch == ')' && stack.peek() == '(') stack.pop();
                    else if (ch == '}' && stack.peek() == '{') stack.pop();
                    else if (ch == ']' && stack.peek() == '[') stack.pop();
                    else break;
                }
            }
            
            if (stack.isEmpty()) answer++;
        }
        
        return answer;
    }
}