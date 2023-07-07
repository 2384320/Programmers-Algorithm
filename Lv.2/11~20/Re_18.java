import java.util.*;

class Solution {
    private List<int[]> list;
    public int[][] solution(int n) {
        list = new ArrayList<>();
        dfs(n, 1, 3);
        
        int[][] answer = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private void dfs(int n, int from, int to) {
        if (n == 1) {
            list.add(new int[] {from, to});
            return;
        }
        
        int empty = 6 - from - to;
        dfs(n-1, from, empty);
        list.add(new int[] {from, to});
        dfs(n-1, empty, to);
    }
}