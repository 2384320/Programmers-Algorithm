class Solution {
    public int mod = 1000000007;
    public int solution(int n) {
        int answer = 0;
        long[] dp = new long[n+1];
        dp[0] = 1;
				dp[2] = 3;
        
        for (int i = 4; i <= n; i+=2) {
            dp[i] = dp[i-2] * 3 + 2;
            for (int j = i - 4; j >= 2; j-=2) {
                dp[i] += dp[j] * 2;
            }
				    dp[i] %= mod;
        }
        answer = (int)dp[n];
        return answer;
    }
}