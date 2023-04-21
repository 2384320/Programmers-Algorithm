class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0, count = 0;
        
        for (int i = 0; i < k; i++) {
            if (count >= numbers.length) count -= numbers.length;
            answer = numbers[count];
            count+=2;
        }
        
        return answer;
    }
}