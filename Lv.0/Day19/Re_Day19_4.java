import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        return (int)Arrays.stream(array).filter(i -> i > height).count();
    }
}
// 값이 바로 반환되도록 stream 사용함.
// 주의사항이 있다면 height보다 큰 값을 골라야 하기 때문에 >=가 아닌 >여야 함.