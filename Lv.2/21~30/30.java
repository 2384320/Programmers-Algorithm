import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
            String str = cities[i];
            int size = queue.size();
            
            if (queue.isEmpty() || !queue.contains(cities[i])) {
                queue.offer(cities[i]);
                answer += 5;
            } else {                
                for (int j = 0; j < size; j++) {
                    if (queue.peek().equals(cities[i])) str = queue.poll();
                    else queue.offer(queue.poll());
                }
                queue.offer(str);
                answer += 1;
            }
            
            while (queue.size() > cacheSize) {
                queue.poll();
            }
        }
        return answer;
    }
}