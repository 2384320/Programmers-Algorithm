import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            if (!queue.contains(city)) {
                queue.offer(city);
                answer += 5;
            } else {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    if (queue.peek().equals(city)) queue.poll();
                    else queue.offer(queue.poll());
                }
                
                queue.offer(city);
                answer += 1;
            }
            while (queue.size() > cacheSize) {
                queue.poll();
            }
        }
        return answer;
    }
}