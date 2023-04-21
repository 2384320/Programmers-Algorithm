class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        char tmp = arr[num2];
        arr[num2] = arr[num1];
        arr[num1] = tmp;

        answer = new String(arr);
        return answer;
    }
}