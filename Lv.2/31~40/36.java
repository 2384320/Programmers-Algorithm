import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < clothes.length; i++) {
            if (hm.containsKey(clothes[i][1])) hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
            else {
                hm.put(clothes[i][1], 1);
                list.add(clothes[i][1]);
            }
        }
        
        for (int i = 0; i < hm.size(); i++) {
            answer *= (hm.get(list.get(i)) + 1);
        }
        
        return answer - 1;
    }
}