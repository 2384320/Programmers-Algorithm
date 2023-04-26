class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int i = 0; i < queries.length; i++) {
            int num1 = queries[i][0];
            int num2 = queries[i][1];
            
            int temp = answer[num1];
            answer[num1] = answer[num2];
            answer[num2] = temp;
        }
        return answer;
    }
}