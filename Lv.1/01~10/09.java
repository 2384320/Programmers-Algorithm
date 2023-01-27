import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, (e1, e2) -> {
            return (int)e2.charAt(0) - (int)e1.charAt(0);
        });
        return String.join("", arr);
    }
}