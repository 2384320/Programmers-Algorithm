class Solution {
    private static final int MAX_RANGE = 10_000_000;
    
    private int answer;
    private char[] arr;
    private boolean[] prime;
    private boolean[] visited;
    public int solution(String numbers) {
        answer = 0;
        arr = numbers.toCharArray();
        prime = new boolean[MAX_RANGE];
        visited = new boolean[arr.length];
        
        findPrime();
        
        for (int i = 1; i <= arr.length; i++) {
            dfs(i, "");
        }
        
        return answer;
    }
    
    private void findPrime() {
        prime[0] = true;
        prime[1] = true;
        
        for (int i = 2; i <= Math.sqrt(MAX_RANGE); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < MAX_RANGE; j += i) {
                prime[j] = true;
            }
        }
    }
    
    private void dfs(int depth, String str) {
        if (str.length() == depth) {
            System.out.println();
            if (!prime[Integer.parseInt(str)]) {
                answer++;
                prime[Integer.parseInt(str)] = true;
            }
            return;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(depth, str + arr[i]);
            visited[i] = false;
        }
    }
}