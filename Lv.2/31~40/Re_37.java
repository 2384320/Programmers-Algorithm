import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        for (int truck : truck_weights) {
            while (true) {
                if (queue.size() == bridge_length) sum -= queue.poll();
                else if (sum + truck <= weight) {
                    queue.offer(truck);
                    answer++;
                    sum += truck;
                    break;
                } else {
                    queue.offer(0);
                    answer++;
                }
            }
        }
        return answer + bridge_length;
    }
}