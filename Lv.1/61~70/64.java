class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0, sum = 0;
        
        for (int i = 1; i <= number; i++) {
            sum = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) sum++;
                else continue;
                if (Math.sqrt(i) == (double)i/j) continue;
                sum++;
            }
            if (sum > limit) sum = power;
            answer += sum;
        }
        return answer;
    }
}