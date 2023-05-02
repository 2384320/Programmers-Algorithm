import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (list.contains(arr[i])) continue;
            list.add(arr[i]);
        }
        
        for (int i = 0; i < k; i++) {
            if (i >= list.size()) answer[i] = -1;
            else answer[i] = list.get(i);
        }
        
        return answer;
    }
}