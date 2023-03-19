import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n-1); i++) {
            if ((n-1) % i == 0) {
                list.add(i);
                if ((n-1) / i != i) list.add((n-1)/i);
            }
        }
        Collections.sort(list);
        return list.get(1);
    }
}