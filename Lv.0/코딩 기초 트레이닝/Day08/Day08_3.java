class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] my_stringArr = my_string.split("");
        for (int idx : index_list) {
            answer += my_stringArr[idx];
        }
        return answer;
    }
}