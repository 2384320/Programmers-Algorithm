class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        x: for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if ((int)ch >= 65) continue x;
            answer += (int)ch - 48;
        }
        
        return answer;
    }
}