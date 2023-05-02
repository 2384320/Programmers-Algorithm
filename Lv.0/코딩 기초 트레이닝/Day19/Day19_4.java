import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (list.isEmpty()) list.add(arr[i++]);
            else if (list.get(list.size()-1) == arr[i]) {
                list.remove(list.size()-1);
                i++;
            } else list.add(arr[i++]);
        }
        
        if (list.isEmpty()) return new int[] {-1};
        answer = new int[list.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}