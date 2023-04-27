class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String suffix = my_string.substring(0, s);
        String prefix = my_string.substring(e+1);
        String[] arr = my_string.substring(s, e+1).split("");
        
        answer += suffix;
        for (int i = arr.length-1; i >= 0; i--) {
            answer += arr[i];
        }
        answer += prefix;
        return answer;
    }
}