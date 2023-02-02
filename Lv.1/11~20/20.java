import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, (e1, e2) -> {
            return Integer.parseInt(e2) - Integer.parseInt(e1);
        });
        return Long.parseLong(String.join("", arr));
    }
}