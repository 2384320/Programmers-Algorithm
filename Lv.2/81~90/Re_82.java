import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for (int t : topping) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        for (int t : topping) {
            set.add(t);
            map.put(t, map.get(t) - 1);
            
            if (map.get(t) == 0)
                map.remove(t);
            if (set.size() == map.size())
                answer++;
        }
        return answer;
    }
}