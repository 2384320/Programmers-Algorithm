class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) answer[i] = numbers[i] + 1;
            else {
                String answerStr = "";
                String str = Long.toBinaryString(numbers[i]);
                if (!str.contains("0")) answerStr = "10" + str.substring(1).replace("0", "1");
                else {
                    int zeroIdx = str.lastIndexOf("0");
                    int oneIdx = str.indexOf("1", zeroIdx);
                    answerStr = str.substring(0, zeroIdx) + "10" + str.substring(oneIdx + 1);
                }
                answer[i] = Long.parseLong(answerStr, 2);
            }
        }
        
        return answer;
    }
}