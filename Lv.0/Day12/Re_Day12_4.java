import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 2;
        List<Integer> list = new ArrayList<>();

        while (count <= n) {
            if (n % count == 0) {
                list.add(count);
                n /= count;
            } else count++;
        }
        return list.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
}
// 값이 바로 반환되도록 함.