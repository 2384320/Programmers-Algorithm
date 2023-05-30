class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0;
        int different = 0;
        char x = '0';
        
        for (char ch : s.toCharArray()) {
            if (x == '0') {
                x = ch;
                answer++;
            }
            if (ch == x) same++;
            else if (ch != x) different++;
            
            if (same - different == 0) {
                same = 0;
                different = 0;
                x = '0';
            } 
        }
        
        return answer;
    }
}