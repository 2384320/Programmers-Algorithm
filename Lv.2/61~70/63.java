import java.util.*;

class Solution {
    private HashMap<String, List<Integer>> hm;
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        hm = new HashMap<>();
 
        for (int i = 0; i < info.length; i++) {
            String[] p = info[i].split(" ");
            saveInfo(p, "", 0);
        }
 
        for (String key : hm.keySet())
            Collections.sort(hm.get(key));
 
        for (int i = 0; i < query.length; i++) {
            query[i] = query[i].replaceAll(" and ", "");
            String[] q = query[i].split(" ");
            answer[i] = hm.containsKey(q[0]) ? binarySearch(q[0], Integer.parseInt(q[1])) : 0;
        }
 
        return answer;
    }
 
    private int binarySearch(String key, int score) {
        List<Integer> list = hm.get(key);
        int start = 0, end = list.size() - 1;
 
        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) < score) start = mid + 1;
            else end = mid - 1;
        }
 
        return list.size() - start;
    }
 
    private void saveInfo(String[] p, String str, int count) {
        if (count == 4) {
            if (!hm.containsKey(str)) {
                List<Integer> list = new ArrayList<Integer>();
                hm.put(str, list);
            }
            hm.get(str).add(Integer.parseInt(p[4]));
            return;
        }
        
        saveInfo(p, str + "-", count + 1);
        saveInfo(p, str + p[count], count + 1);
    }
}