class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char ch : my_string.toCharArray()) {
            if (Character.isLowerCase(ch)) answer[ch-71]++;
            else if (Character.isUpperCase(ch)) answer[ch-65]++;
        }
        return answer;
    }
}