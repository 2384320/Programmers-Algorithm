import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        Map<String, Integer> hm1 = new HashMap<>();
        Map<Integer, String> hm2 = new TreeMap<>();
        
        String player1, player2;
        int idx;
        
        for (int i = 0; i < players.length; i++) {
            hm1.put(players[i], i + 1);
            hm2.put(i + 1, players[i]);
        }
        
        for (int i = 0; i < callings.length; i++) {
            player1 = callings[i];
            if (hm1.get(player1) == 1) continue;
            
            idx = hm1.get(player1);
            player2 = hm2.get(idx - 1);
            
            hm1.put(player1, idx - 1);
            hm1.put(player2, idx);
            
            hm2.put(idx - 1, player1);
            hm2.put(idx, player2);
        }
        
        idx = 0;
        for (int key : hm2.keySet()) {
            answer[idx++] = hm2.get(key);
        }
        return answer;
    }
}