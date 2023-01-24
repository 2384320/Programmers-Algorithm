import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            if (i % divisor == 0) list.add(i);
        }
        if (list.size() == 0) list.add(-1);
        
        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}