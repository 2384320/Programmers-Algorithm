import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        int day = 0;
        for (int num : number) {
            day += num;
        }
        
        for (int i = 0; i <= discount.length - day; i++) {
            int count = 0;
            boolean pass = false;
            
            Map<String, Integer> map = new HashMap<>();
            
            for (int j = 0; j < want.length; j++) {
                map.put(want[j], number[j]);
            }
            
            for (int j = i; j < i + day; j++) {
                if (map.containsKey(discount[j])) map.put(discount[j], map.get(discount[j]) - 1);
                else {
                    pass = true;
                    break;
                }
            }
            
            if (pass) continue;
            
            boolean check = false;
            for (String key : map.keySet()) {
                if (map.get(key) != 0) {
                    check = true;
                    break;
                }
            }
            
            if (check) continue;
            answer++;
        }
        
        return answer;
    }
}