class Solution {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) numbers[i] *= 2;
        return numbers;
    }
}
// answer 변수를 제거하여 변수를 늘리지 않도록 함.
// numbers[i] = numbers[i] * 2를 가독성있으며 간결하게 *= 2로 수정함.
