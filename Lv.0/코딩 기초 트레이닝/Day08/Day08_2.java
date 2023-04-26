import java.util.*;
import java.util.stream.*;

class Solution {
    public static int solution(int a, int b, int c, int d) {
        List<Integer> list = Arrays.asList(a, b, c, d);
        List<Integer> countList = list.stream().map(i -> Collections.frequency(list, i)).collect(Collectors.toList());

        switch (Collections.max(countList)) {
            case 4:
                return a * 1111;
            case 3:
                int p = list.get(countList.indexOf(3));
                int q = list.get(countList.indexOf(1));
                return (int) Math.pow(10 * p + q, 2);
            case 2:
                if (Collections.min(countList) == 2) {
                    final int i = (a + c) * Math.abs(a - c);
                    return i == 0 ? (a + b) * Math.abs(a - b) : i;
                } else {
                    int p1 = list.get(countList.indexOf(2));
                    return (a * b * c * d) / (p1 * p1);
                }
            default:
                return Collections.min(list);
        }
    }
}