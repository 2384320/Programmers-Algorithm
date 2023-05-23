import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] arr = new int[ingredient.length];
        int idx = 0;
        
        for (int i : ingredient) {
            arr[idx++] = i;
            
            if (idx >= 4 && arr[idx - 1] == 1
                && arr[idx - 2] == 3
                && arr[idx - 3] == 2
                && arr[idx - 4] == 1) {
                idx -= 4;
                answer++;
            }
        }
        
        return answer;
    }
}