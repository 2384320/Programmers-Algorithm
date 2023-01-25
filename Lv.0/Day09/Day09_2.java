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
        String[] str = letter.split("\\s");
        
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < morse.length;j++) {
                if (morse[j].equals(str[i])) {
                    answer = "" + answer + (char)(j+97);
                    break;
                }
            }
        }
        
        return answer;
    }
}