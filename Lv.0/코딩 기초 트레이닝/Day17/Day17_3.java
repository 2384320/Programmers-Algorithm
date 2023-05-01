import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            if (str.indexOf("ad") != -1) continue;
            list.add(str);
        }
        answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}