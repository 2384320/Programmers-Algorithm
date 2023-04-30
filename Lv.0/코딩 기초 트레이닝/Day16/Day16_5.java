class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char a = alp.charAt(0);
        for (char ch : my_string.toCharArray()) {
            if (ch == a) answer += Character.toUpperCase(ch);
            else answer += ch;
        }
        return answer;
    }
}