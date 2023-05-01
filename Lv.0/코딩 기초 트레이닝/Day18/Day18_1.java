import java.util.*;
class Solution {
    public int[] solution(String myString) {
        int xCount = myString.replaceAll("[^x]+", "").length();
        int[] answer = new int[xCount+1];
        
        int count = 0;
        int idx = 0;
        for (char ch : myString.toCharArray()) {
            if (ch == 'x') {
                answer[idx++] = count;
                count = 0;
            } else count++;
        }
        answer[idx] = count;
        return answer;
    }
}