import java.util.*;

class Solution {
    int count, n, k;
    List<Node>[] list;
    int[] dp;
    int[][] arr;
    boolean[] visited;
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        count = 0;
        n = N;
        k = K;
        dp = new int[N+1];
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];
        list = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < road.length; i++) {
            int a = road[i][0];
            int b = road[i][1];
            int c = road[i][2];
            
            list[a].add(new Node(b, c));
            list[b].add(new Node(a, c));
        }
        
        dijkstra(1);
        answer = count;
        return answer;
    }
    
    private void dijkstra(int start) {
        Queue<Node> q = new PriorityQueue<>();
        q.add(new Node(start, 0));
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[start] = 0;
        
        while (!q.isEmpty()) {
            Node node = q.poll();
            int to = node.to;
            
            if (visited[to]) continue;
            visited[to] = true;
            
            for (Node nxt : list[to]) {
                if (dp[nxt.to] >= dp[to] + nxt.distance) {
                    dp[nxt.to] = dp[to] + nxt.distance;
                    q.add(new Node(nxt.to, dp[nxt.to]));
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (dp[i] <= k) count++;
        }
    }
}

class Node implements Comparable<Node>{
    int to;
    int distance;

    Node(int to, int weight){
        this.to = to;
        this.distance = weight;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.distance, o.distance);
    }
}