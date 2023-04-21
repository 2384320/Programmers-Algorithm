class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0, count = 0, length = numbers.length;
        
        for (int i = 0; i < k; i++) {
            if (count >= length) count -= length;
            answer = numbers[count];
			count += 2;
        }
        return answer;
    }
}
// 2번 이상 쓰였던 numbers.length를 length 변수로 묶었음.