import java.util.*;

class Solution {
    private String[] priorityOperation = {"*+-", "*-+", "+-*", "+*-", "-*+", "-+*"};
    
    public long solution(String expression) {
        long answer = 0;
        
        List<Character> operator = new ArrayList<>();
        List<Long> operand = new ArrayList<>();
        long num = 0;
        
        for (char ch : expression.toCharArray()) {
            if (!Character.isDigit(ch)) {
                operator.add(ch);
                operand.add(num);
                num = 0;
            } else num = num * 10 + (ch - '0');
        }
        operand.add(num);
        
        for (String po : priorityOperation) {
            List<Character> operatorS = new ArrayList<>(operator);
            List<Long> operandS = new ArrayList<>(operand);
            
            for (char poSymbol : po.toCharArray()) {
                for (int i = 0; i < operatorS.size();) {
                    char oper = operatorS.get(i);
                    if (poSymbol != oper) {
                        i++;
                        continue;
                    }
                    
                    if (oper == '+') operandS.set(i, operandS.get(i) + operandS.get(i + 1));
                    else if (oper == '-') operandS.set(i, operandS.get(i) - operandS.get(i + 1));
                    else operandS.set(i, operandS.get(i) * operandS.get(i + 1));
                    
                    operandS.remove(i + 1);
                    operatorS.remove(i);
                }
            }
            answer = Math.max(answer, Math.abs(operandS.get(0)));
        }
        
        return answer;
    }
}