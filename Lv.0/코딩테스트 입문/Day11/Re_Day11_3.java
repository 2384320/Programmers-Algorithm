import java.util.*;

class Solution {
    public int solution(int[] numbers) {
		int length = numbers.length;
        Arrays.sort(numbers);
        return numbers[length-1] * numbers[length-2];
    }
}
// 배열을 오름차순으로 정렬한 후에 마지막 두 값을 곱함.