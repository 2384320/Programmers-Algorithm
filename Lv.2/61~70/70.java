import java.util.*;

class Solution {
    private int N, answer;
    private boolean[] visited;
    private List<Integer>[] adjList;
    public int solution(int n, int[][] wires) {
        N = n;
        answer = Integer.MAX_VALUE;
        adjList = new ArrayList[n+1];
        
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < wires.length; i++) {
            adjList[wires[i][0]].add(wires[i][1]);
            adjList[wires[i][1]].add(wires[i][0]);
        }
        
        for (int i = 0; i < n - 1; i++) {
            int node1 = wires[i][0];
            int node2 = wires[i][1];
            visited = new boolean[n+1];
            bfs(1, node1, node2);
        }
        return answer;
    }
    
    private void bfs(int start, int limit1, int limit2) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        
        while (!queue.isEmpty()) {
            start = queue.poll();
            
            if (visited[start]) continue;
            visited[start] = true;
            count++;
            
            for (int end : adjList[start]) {
                if (visited[end]) continue;
                if ((start == limit1 && end == limit2)
                    || (start == limit2 && end == limit1)) continue;
                queue.offer(end);
            }
        }
        
        answer = Math.min(answer, Math.abs(count - (N - count)));
    }
}