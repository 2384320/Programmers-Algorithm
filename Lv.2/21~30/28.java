import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int min = 0, sum1 = 0, sum2 = 0;
        
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            String str = str1.substring(i, i+2);
            if (!str.matches("^[a-zA-Z]*$")) continue;
            sum1++;
            if (hm1.containsKey(str)) hm1.put(str, hm1.get(str)+1);
            else hm1.put(str, 1);
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            String str = str2.substring(i, i+2);
            if (!str.matches("^[a-zA-Z]*$")) continue;
            sum2++;
            if (hm2.containsKey(str)) hm2.put(str, hm2.get(str)+1);
            else hm2.put(str, 1);
        }
        
        for (String key : hm1.keySet()) {
            if (hm2.containsKey(key)) min += hm1.get(key) > hm2.get(key) ? hm2.get(key) : hm1.get(key);
        }
        
        float jaccard = (float)min/(float)(sum1 + sum2 - min);
        if (min == 0 && sum1 + sum2 > 0) jaccard = 0;
        else if (min == 0 && sum1 + sum2 == 0) jaccard = 1;
        answer = (int)(jaccard * 65536);
        return answer;
    }
}