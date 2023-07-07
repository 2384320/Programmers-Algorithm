class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isBlank = true;
        
        for (String str : s.toLowerCase().split("")) {
            answer += isBlank ? str.toUpperCase() : str;
            isBlank = str.equals(" ");
        }
        return answer;
    }
}