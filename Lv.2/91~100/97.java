import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        int length = book_time.length;
        int[][] book = new int[length][2];
        for (int i = 0; i < length; i++) {
            book[i] = new int[] {convertInt(book_time[i][0]), convertInt(book_time[i][1]) + 10};
        }
        Arrays.sort(book, (e1, e2) -> e1[0] - e2[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> e1[1] - e2[1]);
        for (int i = 0;i < length; i++) {
            while (!pq.isEmpty() && pq.peek()[1] <= book[i][0])
                pq.poll();
            
            pq.offer(book[i]);
            answer = Math.max(answer, pq.size());
        }
        
        return answer;
    }
    
    private int convertInt(String time) {
        String[] arr = time.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }
}