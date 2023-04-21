class Solution {
    public double solution(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        
        return (double)sum / numbers.length;
    }
}
// 값이 바로 반환되도록 함.
