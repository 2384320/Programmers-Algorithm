class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int cnt;
        char[] skipArr = skip.toCharArray();
        char[] sArr = s.toCharArray();
        
        boolean[] check = new boolean[27];
        check[0] = true;
        
        for (char ch : skipArr) {
            check[ch - 96] = true;
        }
        
        for (char ch : sArr) {
            ch -= 96;
            cnt = 0;
            while (cnt < index) {
                if (++ch >= 27) ch -= 26;
                if (check[ch]) continue;
                cnt++;
            }
            answer += Character.toString(ch+96);
        }
        
        return answer;
    }
}