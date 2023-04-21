class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        int[] before_arr = new int[26];
        int[] after_arr = new int[26];
        
        for (int i = 0; i < before.length(); i++) {
            before_arr[(int)before.charAt(i)-97]++;
            after_arr[(int)after.charAt(i)-97]++;
        }
        
        for (int i = 0; i < before_arr.length; i++) {
            if (before_arr[i] != after_arr[i]) return 0;
        }
        
        return answer;
    }
}