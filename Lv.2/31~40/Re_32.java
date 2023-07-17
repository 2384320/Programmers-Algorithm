import java.util.*;

class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        char a = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(String.valueOf(a), i);
            a++;
        }
        
        String s = "";
        int idx = 27;
        for (int i = 0; i < msg.length(); i++) {
            s += msg.charAt(i);
            
            int j = 1;
            while (i + j <= msg.length() && map.containsKey(msg.substring(i, i + j))) {
                j++;
            }
            
            if (i + j > msg.length()) {
                list.add(map.get(msg.substring(i)));
                break;
            }
            
            list.add(map.get(msg.substring(i, i + j - 1)));
            map.put(msg.substring(i, i + j), idx++);
            if (a > 1) i += j - 2;
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }        
        return answer;
    }
}