class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        
        answer = (max + min) * (max - min + 1) / 2;
        return answer;
    }
}