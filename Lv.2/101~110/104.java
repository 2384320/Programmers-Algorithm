class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sequenceLength = sequence.length;
        
        int start = 0;
        int end = 0;
        int sum = sequence[0];
        int length = sequenceLength;
        while (start <= end && start < sequenceLength && end < sequenceLength) {
            if (sum == k) {
                if (length > end - start) {
                    answer[0] = start;
                    answer[1] = end;
                    length = end - start;
                }
            }
                
            if (sum <= k && end < sequenceLength) {
                end++;
                if (end < sequenceLength) sum += sequence[end];
            } else {
                if (start < sequenceLength) sum -= sequence[start];
                start++;
            }
        }
        
        return answer;
    }
}