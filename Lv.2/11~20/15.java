class Solution {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String[] arr = s.split(" ");

        for (String str : arr) {
            int num = Integer.parseInt(str);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}