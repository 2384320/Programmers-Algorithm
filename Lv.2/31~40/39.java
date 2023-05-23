import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        int day = 0;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + speeds[i] * day < 100) {
                day++;
            }
            queue.add(day);
        }

        int preNum = queue.poll();
        int size = 1;
        int count = 1;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (preNum != num) {
                size++;
                list.add(count);
                count = 0;
            }
            count++;
            preNum = num;
        }
        list.add(count);
        
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}