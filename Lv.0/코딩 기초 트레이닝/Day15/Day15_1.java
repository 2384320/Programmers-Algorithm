class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            int num = arr[i];
            if (num >= 50 && num % 2 == 0) answer[i] = num/2;
            else if (num < 50 && num % 2 == 1) answer[i] = num*2;
            else answer[i] = num;
        }
        return answer;
    }
}