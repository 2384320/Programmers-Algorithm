class Solution {
    int mod = 1234567;
    public long solution(int n) {
        if (n <= 2) return n;
        
        long answer = 0;
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % mod;
        }
        answer = dp[n] % mod;
        
        return answer;
    }
}