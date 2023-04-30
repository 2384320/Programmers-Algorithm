import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) list.add(i);
        }
        
        if (list.isEmpty()) return new int[] {-1};
        
        int[] answer = new int[list.get(list.size()-1) - list.get(0) + 1];
        int idx = 0;
        
        for (int i = list.get(0); i <= list.get(list.size()-1); i++) {
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}