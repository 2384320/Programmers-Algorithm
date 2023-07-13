import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int sum1 = 0;
        int sum2 = 0;
        
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            String s = str1.substring(i, i + 2);
            if (!s.matches("[A-Za-z]*")) continue;
            hm1.put(s, hm1.getOrDefault(s, 0) + 1);
            sum1++;
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            String s = str2.substring(i, i + 2);
            if (!s.matches("[A-Za-z]*")) continue;
            hm2.put(s, hm2.getOrDefault(s, 0) + 1);
            sum2++;
        }
        
        int min = 0;
        for (String key : hm1.keySet()) {
            if (hm2.containsKey(key))
                min += hm1.get(key) > hm2.get(key) ? hm2.get(key) : hm1.get(key);
        }
        
        double answer = (double) min / (double) (sum1 + sum2 - min);
        if (sum1 + sum2 - min == 0) answer = 1;
        
        return (int) (answer * 65536);
    }
}