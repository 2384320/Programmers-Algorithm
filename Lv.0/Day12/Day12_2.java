import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        String result = "";
        
        x: for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if ((int)ch >= 97) continue x;
            count++;
            result += ch;
        }

        int[] answer = new int[count];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int)result.charAt(i) - 48;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}