class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] strArr = s.split("");
        String str = "";
        
        x: for (int i = 0; i < s.length(); i++) {
            str = strArr[i];
            for (int j = i; j >= 0; j--) {
                if (str.equals(strArr[j]) && j != i) {
                    answer[i] = i-j;
                    continue x;
                }
            }
            answer[i] = -1;
        }
        
        return answer;
    }
}