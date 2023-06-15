import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> hm = new HashMap<>();
                
        for (int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
        }
        
        for (String calling : callings) {
            int idx = hm.get(calling);
            if (idx <= 0) continue;
            
            String temp = answer[idx];
            answer[idx] = answer[idx-1];
            answer[idx-1] = temp;
            
            hm.put(answer[idx], idx);
            hm.put(answer[idx-1], idx - 1);
        }
        return answer;
    }
}