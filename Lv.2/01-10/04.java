class Solution {
    public String solution(int n) {
        String answer = "";
        
        while (n > 0) {
            int result = n % 3 == 0 ? 4 : n % 3;
            answer = Integer.toString(result).concat(answer);
            n = (n - 1) / 3;
        } 
        return answer;
    }
}