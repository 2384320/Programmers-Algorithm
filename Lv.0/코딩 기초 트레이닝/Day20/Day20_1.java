class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int length = arr.length;

        int num = 1;
        
        while (length > num) {
            num *= 2;
        }
        
        answer = new int[num];
        for (int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}