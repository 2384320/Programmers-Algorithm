import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                list.add(n/i);
            }
        }
        return list.stream().sorted().distinct().mapToInt(Integer::intValue).toArray();
    }
}
// n까지 반복했던 반복문을 n 제곱근까지만 반복되도록 함.
// 반복이 덜어진 만큼 list에 n/i가 추가되도록 했고 마지막에 정렬과 중복 제거 작업으로 배열 완성함.