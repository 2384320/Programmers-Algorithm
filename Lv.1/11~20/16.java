class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i != 0) continue;
            answer += i;
            
            if (n == 1) continue;
            if (i == Math.sqrt(n)) continue;
            else answer += n/i;
        }
        return answer;
    }
}