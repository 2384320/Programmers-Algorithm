class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i < Integer.toString(n).length(); i++) {
            answer += (int)(Integer.toString(n).charAt(i)) - 48;
        }
        
        return answer;
    }
}