class Solution {
    public String solution(String s) {
        String answer = "";
        int[] check = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            check[(int)(s.charAt(i)-97)]++;
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i] == 1) answer += (char)(i + 97);
        }
        return answer;
    }
}