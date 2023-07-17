import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] file = new String[files.length][3];
        
        for (int i = 0; i < files.length; i++) {
            int idx = 0;
            while (!Character.isDigit(files[i].charAt(idx)))
                idx++;
            
            file[i][0] = files[i].substring(0, idx);
            
            int idx2 = idx;
            while (idx2 < files[i].length() && Character.isDigit(files[i].charAt(idx2)))
                idx2++;
            
            if (idx > files[i].length()) {
                file[i][1] = files[i].substring(idx);
                file[i][2] = "";
            } else {
                file[i][1] = files[i].substring(idx, idx2);
                file[i][2] = files[i].substring(idx2);
            }
        }
        
        Arrays.sort(file, (o1, o2) -> {
            String e1 = o1[0].toLowerCase();
            String e2 = o2[0].toLowerCase();
            
            if (e1.compareTo(e2) > 0) return 1;
            else if (e1.compareTo(e2) < 0) return -1;
            else {
                int num1 = Integer.parseInt(o1[1]);
                int num2 = Integer.parseInt(o2[1]);
                if (num1 > num2) return 1;
                else if (num1 < num2) return -1;
                else return 0;
            }
        });
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = file[i][0] + file[i][1] + file[i][2];
        }
        
        return answer;
    }
}