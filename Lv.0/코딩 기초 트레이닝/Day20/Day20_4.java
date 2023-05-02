class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        int idx = 0;
        
        if (answer.length % 2 == 0) idx = 1;
        
        for (int i = idx; i < answer.length; i+=2) {
		        answer[i] += n;
        }
        return answer;
    }
}