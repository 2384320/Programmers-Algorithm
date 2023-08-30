class Solution {
    private int answer;
    private boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        visited = new boolean[dungeons.length];
        explore(0, k, dungeons);
        return answer;
    }
    
    public void explore(int count, int fatigue, int[][] dungeons) {
        for (int i = 0; i< dungeons.length; i++) {
            if (visited[i] || fatigue < dungeons[i][0]) continue;
            visited[i] = true;
            explore(count + 1, fatigue - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        
        answer = Math.max(answer, count);
    }
}