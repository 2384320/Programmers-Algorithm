class Solution {
    public String solution(int age) {
        String answer = "";
        
        for(int i = 0; i < (age+"").length(); i++) {
            answer += (char)((age+"").charAt(i) + 49);
        }
        return answer;
    }
}