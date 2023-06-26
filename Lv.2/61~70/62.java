import java.util.*;

class Solution {
    private Map<String, Integer> map;
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        List<String> result = new ArrayList<>();
        
        for (int c : course) {
            map = new HashMap<>();
            for (String order : orders) {
                dfs(0, 0, order, c, new ArrayList<Character>());
            }
            
            int maxCount = Integer.MIN_VALUE;
            for (String key : map.keySet()) {
                if (map.get(key) == 1) continue;
                maxCount = Math.max(maxCount, map.get(key));
            }
            if (maxCount <= 1) continue;
                        
            for (String key: map.keySet()) {
                if (map.get(key) != maxCount) continue;
                result.add(key);
            }
        }
        Collections.sort(result);
        answer = new String[result.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
    
    private void dfs(int depth, int idx, String order, int c, List<Character> combiList) {
        if (depth == c) {
            char[] combiArr = new char[c];
            for (int i = 0; i < c; i++) {
                combiArr[i] = combiList.get(i);
            }
            Arrays.sort(combiArr);
            String combiStr = new String(combiArr);
            map.put(combiStr, map.getOrDefault(combiStr, 0) + 1);
            return;
        }
                
        for (int i = idx; i < order.length(); i++) {
            combiList.add(order.charAt(i));
            dfs(depth + 1, i + 1, order, c, combiList);
            combiList.remove(combiList.size() - 1);
        }
    }
}