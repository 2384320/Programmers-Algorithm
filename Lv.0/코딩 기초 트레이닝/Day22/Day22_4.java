import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer ;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        for (int i = 0; i < delete_list.length; i++) {
            if (list.indexOf(delete_list[i]) != -1) list.remove(list.indexOf(delete_list[i]));
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}