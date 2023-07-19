import java.util.*;

class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[cards.length];
        
        for (int i = 0; i < cards.length; i++) {
            int k = i;
            int count = 0;
            while (true) {
                if (!visited[k]) {
                    visited[k] = true;
                    count++;
                    k = cards[k] - 1;
                } else {
                    break;
                }
            }
            if (count != 0) list.add(count);
        }
        
        if (list.size() == 1) return 0;
        
        Collections.sort(list);
        answer = list.get(list.size() - 1) * list.get(list.size() - 2);
        return answer;
    }
}