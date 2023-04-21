/* 문자 반복 출력하기
* 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요. */
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char[] str = new char[arr.length*n];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                str[i*n+j] = arr[i];
            }
        }
        answer = new String(str);
        return answer;
    }
}