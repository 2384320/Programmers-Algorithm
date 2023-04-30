class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];
        int idx = 0;
        
        for (int i = n; i < length; i++) {
            answer[idx++] = num_list[i];
        }
        
        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}