import java.util.*;

class Solution {
    private static final int INF = 100_000_000;
    
    private int[] dp;
    private boolean[] visited;
    private List<Node>[] list;

    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        dp = new int[N+1];
        visited = new boolean[N+1];
        list = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        
        for (int[] r : road) {
            list[r[0]].add(new Node(r[1], r[2]));
            list[r[1]].add(new Node(r[0], r[2]));
        }
        
        dijkstra(1);
        
        for (int i = 1; i <= N; i++) {
            if (dp[i] <= K) answer++;
        }

        return answer;
    }
    
    private void dijkstra(int start) {
        Queue<Node> queue = new PriorityQueue<>();
        queue.offer(new Node(start, 0));
        Arrays.fill(dp, INF);
        dp[start] = 0;
        
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            int to = n.to;
            
            if (visited[to]) continue;
            visited[to] = true;
            
            for (Node nxt : list[to]) {
                if (dp[nxt.to] >= nxt.dist + dp[to]) {
                    dp[nxt.to] = nxt.dist + dp[to];
                    queue.offer(new Node(nxt.to, dp[nxt.to]));
                }
            }
        }
    }
}

class Node implements Comparable<Node> {
    int to;
    int dist;
    
    Node(int to, int dist) {
        this.to = to;
        this.dist = dist;
    }
    
    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.dist, o.dist);
    }
}