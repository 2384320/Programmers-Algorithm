class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replaceAll("A", "1");
        myString = myString.replaceAll("B", "A");
        myString = myString.replaceAll("1", "B");
        answer = myString.indexOf(pat);
        if (answer != -1) answer = 1;
        else answer = 0;
        return answer;
    }
}