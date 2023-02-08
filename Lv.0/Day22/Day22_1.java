class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            answer++;
            while (true) {
                if (answer % 3 == 0 || answer % 10 == 3 || answer / 10 == 3 || answer / 10 % 10 == 3) {
                    answer++;
                } else break;
            }
        }
        return answer;
    }
}