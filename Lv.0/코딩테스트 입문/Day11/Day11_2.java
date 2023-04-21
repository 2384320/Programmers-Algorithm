class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0) count++;
            }
            if (count >= 3) answer++;
        }
        return answer;
    }
}