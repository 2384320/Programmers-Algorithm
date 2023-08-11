import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashSet<String> hs = new HashSet<>();
        String[] arr = s.replaceAll("[{}]", " ").trim().split(" ,");
        int[] answer = new int[arr.length];
        
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
        
        int idx = 0;
        for (String str : arr) {
            for (String ss : str.split(",")) {
                ss = ss.trim();
                if (hs.contains(ss)) continue;
                hs.add(ss);
                answer[idx++] = Integer.parseInt(ss);
            }
        }
        return answer;
    }
}