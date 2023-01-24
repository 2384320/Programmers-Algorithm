import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
// Arrays.copyOfRange(arr, start, end): arr를 start 인덱스부터 end - 1 인덱스까지 자름.
// arr = {1, 2, 3, 4, 5, 6, 7, 8, 9} -> Arrays.copyOfRange(arr, 3, 7) => {4, 5, 6, 7}