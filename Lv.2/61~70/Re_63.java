import java.util.*;

class Solution {
    HashMap<String, List<Integer>> hm;
    public int[] solution(String[] info, String[] query) {
        int length = query.length;
        int[] answer = new int[length];
        hm = new HashMap<>();
        
        for (String i : info)
            saveInfo(i.split(" "), "", 0);
        
        for (String key : hm.keySet())
            Collections.sort(hm.get(key));
        
        for (int i = 0; i < length; i++) {
            query[i] = query[i].replaceAll(" and ", "");
            String[] q = query[i].split(" ");
            answer[i] = hm.containsKey(q[0]) ? binarySearch(q[0], Integer.parseInt(q[1])) : 0;
        }
        return answer;
    }
    
    private void saveInfo(String[] info, String str, int depth) {
        if (depth == 4) {
            if (!hm.containsKey(str)) {
                List<Integer> list = new ArrayList<>();
                hm.put(str, list);
            }
            hm.get(str).add(Integer.parseInt(info[4]));
            return;
        }
        
        saveInfo(info, str + "-", depth + 1);
        saveInfo(info, str + info[depth], depth + 1);
    }
    
    
    private int binarySearch(String key, int score) {
        List<Integer> list = hm.get(key);
        int start = 0;
        int end = list.size() - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) < score)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return list.size() - start;
    }
}