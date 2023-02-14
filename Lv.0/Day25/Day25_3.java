class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;
        
        for (int i = -49; i <= 1000; i++) {
            sum = 0;
            for (int j = 0; j < num; j++) {
                answer[j] = i;
                sum += i;
                i++;
            }
            i -= num;
            if (sum == total) break;
        } 
        return answer;
    }
}