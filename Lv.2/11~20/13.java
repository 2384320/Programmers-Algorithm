class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int start = 1;
        int end = 1;
        int sum = 1;
        
        while (end != n) {
            if (sum == n) {
                answer++;
                sum += ++end;
            } else if (sum > n) sum -= start++;
            else sum += ++end;
        }
        
        return answer;
    }
}