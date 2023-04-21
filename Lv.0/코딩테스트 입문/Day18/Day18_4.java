import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 90) arr[i] = (char)((int)arr[i] + 32);
        }
        Arrays.sort(arr);
        answer = new String(arr);
        return answer;
    }
}
/* 수정본
import java.util.*;
class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
*/