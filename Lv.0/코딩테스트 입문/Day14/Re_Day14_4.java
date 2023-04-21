class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);
            if (ch >= 97) answer += String.valueOf(ch).toUpperCase();
            else answer += String.valueOf(ch).toLowerCase();
        }
        return answer;
    }
}
// 자주 사용하는 charAt()을 변수로 묶어 사용하고 valueOf()와 toLowerCase/toUpperCase를 사용해 바로 문자열 제작함.