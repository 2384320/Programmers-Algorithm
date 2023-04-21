class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
          answer += my_string.charAt(i);
        }
        return answer;
    }
}
// toCharArray를 charAt을 사용하여 불필요한 부분은 간추림.
