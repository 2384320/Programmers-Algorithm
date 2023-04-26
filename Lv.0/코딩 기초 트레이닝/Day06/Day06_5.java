class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int num = Integer.MAX_VALUE;
            
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] <= queries[i][2]) continue;
                num = Math.min(arr[j], num);
            }
            answer[i] = num != Integer.MAX_VALUE ? num : -1;
        }
        return answer;
    }
}