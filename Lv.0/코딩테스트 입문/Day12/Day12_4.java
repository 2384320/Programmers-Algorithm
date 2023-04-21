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
        answer = list.stream().distinct().mapToInt(Integer::intValue).toArray();
        // stream(): 데이터의 흐름, 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있음.
        // mapToInt(Integer::intValue): Integer[] -> Int[]
        // toArray(): List -> Array
        
        return answer;
    }
}