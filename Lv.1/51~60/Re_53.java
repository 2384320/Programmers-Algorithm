class Solution {
    public int solution(int[][] sizes) {
        int answer = 0, width = 0, height = 0;
        
        for (int[] card : sizes) {
            width = Math.max(width, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        answer = width * height;
        return answer;
    }
}