class Solution {
    public String solution(String s) {
        String answer = "";
        int blank = 1;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (blank > 0) {
                    answer += Character.toUpperCase(ch);
                    blank = 0;
                }
                else answer += Character.toLowerCase(ch);
            } else {
                if (ch == ' ') blank++;
                else blank = 0;
                answer += ch;
            }
        }

        return answer;
    }
}