class Solution {
    public String solution(String s) {
        String answer = "";
        int[] checkArr = new int[26];
        
        for (char ch : s.toCharArray()) {
            checkArr[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (checkArr[i] == 1) answer += (char)(i + 'a');
        }
        return answer;
    }
}
// 변수명 변경에 힘 씀.
// char이나 int로 인해 지저분하게 보이는 부분 변경함.
// 아스키 코드 97로 되어있던 부분은 'a'로 변경함.