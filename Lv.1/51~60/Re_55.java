import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> idMap = new HashMap<>();
        HashMap<String, List<String>> reportMap = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
            idMap.put(id_list[i], i);
            reportMap.put(id_list[i], new ArrayList<>());
        }
        
        for (String reported : report) {
            String[] temp = reported.split(" ");
            if (!reportMap.get(temp[1]).contains(temp[0])) {
                reportMap.get(temp[1]).add(temp[0]);
            }
        }
        
        for (String id : reportMap.keySet()) {
            if (reportMap.get(id).size() >= k) {
                for (String reporter : reportMap.get(id)) {
                    answer[idMap.get(reporter)]++;
                }
            }
        }
        
        return answer;
    }
}