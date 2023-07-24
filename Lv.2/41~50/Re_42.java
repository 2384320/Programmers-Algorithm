import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strArr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(strArr, ((o1, o2) -> (o2+o1).compareTo(o1+o2)));
        
        for (String str : strArr) {
            answer += str;
        }
        
        if (answer.charAt(0) == '0') answer = "0";
        return answer;
    }
}