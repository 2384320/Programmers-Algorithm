import java.util.*;

class Solution {
    public int solution(int n) {
        String[] arr = Integer.toString(n).split("");
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}
// stream으로 바꿈.