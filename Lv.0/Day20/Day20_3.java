class Solution {
    public int solution(int[] numbers) {
        int answer = 0, max = -100000000;
        
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i]*numbers[j] > max) max = numbers[i] * numbers[j];
            }
        }
        answer = max;
        return answer;
    }
}