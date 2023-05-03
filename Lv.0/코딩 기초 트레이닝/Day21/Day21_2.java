import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int idx = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) hm.put(rank[i], i);
        }
        
        List<Integer> list = new ArrayList<>(hm.keySet());
        list.sort((s1, s2) -> s1.compareTo(s2));
        
        for (int i = 0; i < 3; i++) {
            answer = answer * 100 + hm.get(list.get(i));
        }

        return answer;
    }
}