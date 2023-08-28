class Solution {
    private int N, min;
    private int[] vst;
    private int[][] map;
    public int solution(int n, int[][] wires) {
        N = n;
        min = n;
        vst = new int[n + 1];
        map = new int[n + 1][n + 1];
        
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            map[a][b] = map[b][a] = 1;
        }
        
        dfs(1);
        return min;
    }
    
    private int dfs(int start) {
        vst[start] = 1;
        int child = 1;
        
        for (int i = 1; i <= N; i++) {
            if (vst[i] == 0 && map[start][i] == 1) {
                vst[i] = 1;
                child += dfs(i);
            }
        }
        min = Math.min(min, Math.abs(child - (N - child)));
        return child;
    }
}