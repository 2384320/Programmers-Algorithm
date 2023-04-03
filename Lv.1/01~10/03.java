class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int size = arr.length;
        
        if (size % 2 == 0) answer = arr[size/2-1] + arr[size/2];
        else answer = arr[size/2];
        
        return answer;
    }
}