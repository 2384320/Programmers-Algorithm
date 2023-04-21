class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code; i <= cipher.length(); i += code) {
            answer += cipher.substring(i-1, i);
        }
        return answer;
    }
}
// charAt으로 바꿨던 부분을 substring을 이용해서 String으로만 실행할 수 있도록 바꿈.