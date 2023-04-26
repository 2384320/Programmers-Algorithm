class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int idx = 0;
        for (int num : num_list) {
            answer[idx++] = num;
        }
        
        if (answer[idx-2] < answer[idx-1]) answer[idx] = answer[idx-1] - answer[idx-2];
        else answer[idx] = answer[idx-1]*2;
        
        return answer;
    }
}