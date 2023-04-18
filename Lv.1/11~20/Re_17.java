class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArr = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == ' ') idx = 0;
            else chArr[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chArr[i]) : Character.toLowerCase(chArr[i]));
        }
        answer = String.valueOf(chArr);

        return answer;
    }
}