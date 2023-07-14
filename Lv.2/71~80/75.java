import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {        
        HashMap<String, Integer> hm = new HashMap<>();
        List<String> visited = new ArrayList<>();
        
        for (String record : records) {
            String[] r = record.split(" ");
            
            int hour = Integer.parseInt(r[0].substring(0, 2)) * 60;
            int min = Integer.parseInt(r[0].substring(3, 5));
            if (r[2].equals("IN")) {
                hm.put(r[1], hm.getOrDefault(r[1], 0) - hour - min);
                visited.add(r[1]);
            } else {
                hm.put(r[1], hm.get(r[1]) + hour + min);
                visited.remove(r[1]);
            }
        }
        
        for (String v : visited) {
            int hour = 23 * 60;
            int min = 59;
            hm.put(v, hm.get(v) + hour + min);
        }
                
        int[] answer = new int[hm.size()];
        
        List<String> keys = new ArrayList<>(hm.keySet());
        Collections.sort(keys);
        int idx = 0;
        for (String key : keys) {
            int fee = fees[1];
            int time = hm.get(key);

            if (time >= fees[0]) {
                int a = (int)Math.ceil((time - fees[0]) / fees[2]);
                if ((time - fees[0]) % fees[2] != 0) a++;
                fee += a * fees[3];
            }
            answer[idx++] = fee;
        }
        
        return answer;
    }
}