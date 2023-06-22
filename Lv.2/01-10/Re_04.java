class Solution {
    public String solution(int n) {
        String answer = "";
        String[] arr = new String[] {"4", "1", "2"};
        
        while (n > 0) {
            answer = arr[n % 3].concat(answer);
            n = (n - 1) / 3;
        } 
        return answer;
    }
}