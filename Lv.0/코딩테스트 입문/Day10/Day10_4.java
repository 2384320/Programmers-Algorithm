class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int count = 0;

        if (direction.equals("right")) count = numbers.length - 1;
        else if (direction.equals("left")) count = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (count >= numbers.length) count = count - numbers.length;
            answer[i] = numbers[count];
            count++;
        }
        return answer;
    }
}