import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
// 값이 바로 반환되도록 함.
