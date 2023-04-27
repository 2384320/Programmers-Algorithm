class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int my_stringLength = my_string.length();
        int is_prefixLength = is_prefix.length();
        if (my_stringLength < is_prefixLength) answer = 0;
        else if (my_string.substring(0, is_prefixLength).equals(is_prefix)) answer = 1;
        else answer = 0;
        return answer;
    }
}