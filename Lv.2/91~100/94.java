import java.util.*;

class Solution {
    private int[] visited;
    public int solution(int x, int y, int n) {
        visited = new int[1000001];
        Arrays.fill(visited, -1);
        bfs(x, y, n);
        return visited[y];
    }
    
    private void bfs(int start, int end, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = 0;
        
        while (!queue.isEmpty()) {
            int num = queue.poll();
            
            if (num == end) return;
            
            int plusN = num + n;
            if (check(plusN, end)) {
                visited[plusN] = visited[num] + 1;
                queue.offer(plusN);
            }
            
            int multiTwo = num * 2;
            if (check(multiTwo, end)) {
                visited[multiTwo] = visited[num] + 1;
                queue.offer(multiTwo);
            }
            
            int multiThree = num * 3;
            if (check(multiThree, end)) {
                visited[multiThree] = visited[num] + 1;
                queue.offer(multiThree);
            }
        }
        
        return;
    }
    
    private boolean check(int num, int end) {
        if (num > end || visited[num] != -1) return false;
        return true;
    }
}