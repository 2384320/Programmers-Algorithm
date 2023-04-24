import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int idx = 0;
        int[] answer = new int[length - 1];
        if (answer.length <= 0) return new int[] {-1};
        
        int min = arr[0];
        for (int i = 0; i < length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        
        for (int i = 0; i < length; i++) {
            if (min == arr[i]) continue;
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}