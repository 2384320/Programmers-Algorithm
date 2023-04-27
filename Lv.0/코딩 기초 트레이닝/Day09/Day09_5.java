class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int my_stringLength = my_string.length();
        int is_suffixLength = is_suffix.length();
        if (my_stringLength < is_suffixLength) answer = 0;
        else if (my_string.substring(my_stringLength-is_suffixLength).equals(is_suffix)) answer = 1;
        else answer = 0;
        return answer;
    }
}