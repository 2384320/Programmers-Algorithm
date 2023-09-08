import java.util.*;

class Solution {
    public int solution(int[] cards) {        
        int length = cards.length;
        boolean[] visited = new boolean[length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < length; i++) {
            int k = i;
            int count = 0;
            while (!visited[k]) {
                visited[k] = true;
                count++;
                k = cards[k] - 1;
            }
            list.add(count);
        }
        Collections.sort(list, Comparator.reverseOrder());
        return list.get(0) * list.get(1);
    }
}