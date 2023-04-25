class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx = 0;
        if (n % 2 == 0) idx = 2;
        else idx = 1;
        
        while (idx <= n) {
            if (idx % 2 == 0) answer += Math.pow(idx, 2);
            else answer += idx;
            idx += 2;
        }
        return answer;
    }
}