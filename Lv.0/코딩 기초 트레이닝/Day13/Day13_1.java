class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length - n + 1];
        int idx = 0;
        for (int i = n - 1; i < length; i++) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}