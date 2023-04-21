/* 문자열 뒤집기
* 문자열 my_string이 매개변수로 주어집니다.
* my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요. */
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] str = my_string.toCharArray();
        char[] arr = new char[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = str[str.length-i-1];
        }
        answer = new String(arr);
        return answer;
    }
}