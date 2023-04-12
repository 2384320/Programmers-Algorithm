class Solution {
    public String solution(int n) {
        String answer = "";
        while (n-- > 0) {
            if (n % 2 == 0) answer = "수".concat(answer);
            else answer = "박".concat(answer);
        }
        return answer;
    }
}