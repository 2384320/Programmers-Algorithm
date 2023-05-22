import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];
        Stack<int[]> stack = new Stack<>();
        
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && prices[i] < stack.peek()[0]) { // 하락인 경우
                int fall = stack.pop()[1];
                answer[fall] = i - fall; // 전 인덱스의 answer에 바로 값 저장
            }
            stack.push(new int[] {prices[i], i}); // 가격과 해당 인덱스(날짜) 저장
        }
        
        while (!stack.isEmpty()) { // 한 번도 하락하지 않은 값만
            int idx = stack.pop()[1];
            answer[idx] = length - idx - 1; // answer에 값 저장.
        }
        return answer;
    }
}