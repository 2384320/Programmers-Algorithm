class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] arr = number.split("");
        
        for (String str : arr) {
            answer += Integer.parseInt(str);
        }
        return answer % 9;
    }
}