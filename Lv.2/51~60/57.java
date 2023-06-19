import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashSet<String> hs = new HashSet<>();
        String[] arr = s.replaceAll("[{}]", " ").trim().split(" ,");
        Arrays.sort(arr, (a, b) -> a.length()-b.length());
        
        int[] answer = new int[arr.length];
        
        int i = 0;
        for (String str : arr) {
            for (String ss : str.split(",")) {
                ss = ss.trim();
                if (hs.contains(ss)) continue;
                hs.add(ss);
                answer[i++] = Integer.parseInt(ss);
            }
        }
        
        return answer;
    }
}