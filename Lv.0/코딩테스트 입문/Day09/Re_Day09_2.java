import java.util.Arrays;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };
        String[] letterArr = letter.split("\\s");
        
        for (String str : letterArr) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(str)) answer += (char)(j+97);
            }
        }
        return answer;
    }
}
// 변수명 조금 더 알아보기 쉽게 수정함.
// if 문에 break 없애서 되도록 한 줄로 끝나도록 함.