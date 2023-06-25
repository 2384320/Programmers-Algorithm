class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            answer[0]++;
            answer[1] += s.replaceAll("1", "").length();
            s = s.replaceAll("0", "");
            int length = s.length();
            s = Integer.toString(length, 2);
        }
        return answer;
    }
}