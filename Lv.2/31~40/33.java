import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] answer2 = new String[files.length][3];
        
        for (int i = 0; i < files.length; i++) {
            String str = files[i];
            
            int start = -1;
            int end = -1;
            int size = 0;
            boolean first = true;
            
            char[] chArr = str.toCharArray();
            for (int j = 0; j < str.length(); j++) {
                if (Character.isDigit(chArr[j])) {
                    if (first) {
                        start = j;
                        first = false;
                    }
                    size++;
                } else if (!first) break;
            }
            
            end = start + size - 1;
            
            answer2[i][0] = str.substring(0, start);
            answer2[i][1] = str.substring(start, end + 1);
            answer2[i][2] = str.substring(end + 1);
        }
        
        Arrays.sort(answer2, (e1, e2) -> {
            String str1 = e1[0].toLowerCase();
            String str2 = e2[0].toLowerCase();
            if (str1.compareTo(str2) > 0) return 1;
            else if (str1.compareTo(str2) < 0) return -1;
            else {
                int num1 = Integer.parseInt(e1[1]);
                int num2 = Integer.parseInt(e2[1]);
                if (num1 > num2) return 1;
                else if (num1 < num2) return -1;
                else return 0;
            }
        });
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer2[i][0] + answer2[i][1] + answer2[i][2];
        }
        
        return answer;
    }
}