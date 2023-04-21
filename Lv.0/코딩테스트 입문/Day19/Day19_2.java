import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i+=n) {
            int start = i;
            int end = i + n;
            if (end > my_str.length() + 1) list.add(my_str.substring(start));
            else list.add(my_str.substring(start, end));
        }
        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}