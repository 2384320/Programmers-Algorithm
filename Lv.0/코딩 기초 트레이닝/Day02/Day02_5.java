class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string;
        
        int my_string_length = my_string.length();
        int answer_length = answer.length();
        if (my_string_length > answer_length) answer += my_string.substring(answer_length, my_string_length);
        return answer;
    }
}