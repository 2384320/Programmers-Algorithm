class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int num = 0;
        int idx = 0;
        while (answer.length() < t) {
            String str = Integer.toString(num++, n).toUpperCase();
            int length = str.length();
            
            for (int i = 0; i < length; i++) {
                idx = idx % m + 1;
                if (idx != p) continue;
                if (answer.length() >= t) break;
                answer += str.substring(i, i+1);
            }
        }
        
        return answer;
    }
}