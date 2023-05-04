class Solution {
    public String solution(String myString) {
        String answer = "";
        for (char ch : myString.toCharArray()) {
            if (ch < 'l') ch = 'l';
            answer += ch;
        }
        return answer;
    }
}