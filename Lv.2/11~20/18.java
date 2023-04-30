import java.util.*;

class Solution {
    List<int[]> list = new ArrayList<>();
    public int[][] solution(int n) {
        hanoi(n, 1, 3);
        
        int[][] answer = new int[list.size()][2];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    
    public void hanoi(int n, int from, int to) {
        if (n == 1) {
            list.add(new int[] {from, to});
            return;
        }
        
        int empty = 6 - from - to;
        hanoi(n-1, from, empty);
        list.add(new int[] {from, to});
        hanoi(n-1, empty, to);
    }
}