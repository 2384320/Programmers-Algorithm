import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int length = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[length - 1] * numbers[length - 2]);
    }
}
// 가장 문제가 되는 부분이 - x - 가 +라는 부분인데 배열을 정렬시킨 후
// 양쪽에서의 두 데이터를 곱해 둘 중 큰 값을 max로 올리는 전략을 세움.