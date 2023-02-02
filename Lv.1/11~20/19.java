class Solution {
    public int[] solution(long n) {
        String[] arr = Long.toString(n).split("");
        int length = arr.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[length - i - 1] = Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}