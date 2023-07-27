import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int t : tangerine) {
            hm.put(t, hm.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> keyList = new ArrayList<>(hm.keySet());
        keyList.sort((v1, v2) -> hm.get(v2) - hm.get(v1));
        
        for (int key : keyList) {
            if (k <= 0) break;
            k -= hm.get(key);
            answer++;
        }
        return answer;
    }
}