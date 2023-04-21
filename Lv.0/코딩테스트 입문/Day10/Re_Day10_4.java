class Solution {
    public int[] solution(int[] numbers, String direction) {
        int count = 0, length = numbers.length;
		int[] answer = new int[length];
		
        if (direction.equals("right")) count = length - 1;
        else if (direction.equals("left")) count = 1;

        for (int i = 0; i < length; i++) {
            if (count >= length) count -= length;
            answer[i] = numbers[count];
            count++;
        }
        return answer;
    }
}
// 여러 번 사용된 numbers.length를 length 변수로 묶음.
// count -= length로 변경하여 코드를 간추림.