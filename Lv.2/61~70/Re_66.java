class Solution {
    public long[] solution(long[] numbers) {
        int length = numbers.length;
        long[] answer = new long[length];
        
        for (int i = 0; i < length; i++) {
            if (numbers[i] % 2 == 0) answer[i] = numbers[i] + 1;
            else {
                StringBuilder sb = new StringBuilder();
                String str = Long.toBinaryString(numbers[i]);
                if (str.contains("0")) {
                    int zeroIdx = str.lastIndexOf("0");
                    int oneIdx = str.indexOf("1", zeroIdx);
                    sb.append(str.substring(0, zeroIdx))
                        .append("10")
                        .append(str.substring(oneIdx + 1));
                } else sb.append("10" + str.substring(1).replace("0", "1"));
                answer[i] = Long.parseLong(sb.toString(), 2);
            }
        }
        return answer;
    }
}