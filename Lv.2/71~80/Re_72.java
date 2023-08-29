class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        
        int idx = 0;
        for (long i = left; i <= right; i++) {
            int x = (int)(i / n) + 1;
            int y = (int)(i % n) + 1;
            answer[idx++] = Math.max(x, y);
        }
        return answer;
    }
}