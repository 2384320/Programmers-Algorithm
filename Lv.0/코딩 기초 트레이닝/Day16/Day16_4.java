class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char ch : myString.toCharArray()) {
            if (ch == 'a' || ch == 'A') answer += Character.toUpperCase(ch);
            else answer += Character.toLowerCase(ch);
        }
        return answer;
    }
}