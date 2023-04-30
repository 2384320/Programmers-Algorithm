class Solution {
    public int[] solution(int[] arr, int[] query) {    
        int start = 0;
        int end = arr.length-1;
        
        for (int i = 0; i < query.length; i++) {
            int queryNum = query[i];
            if (i % 2 == 0) end = queryNum + start;
            else start += queryNum;
        }
        
        int[] answer = new int[end-start+1];
        int idx = 0;
        for (int i = start; i <= end; i++) {
            answer[idx++] = arr[i];
        }
        return answer;
    }
}