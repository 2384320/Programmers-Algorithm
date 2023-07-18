class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int num = 0;
        int idx = 0;
        while (answer.length() < t) {
            String str = Integer.toString(num++, n);
            int length = str.length();
            
            for (int i = 0; i < length; i++) {
                idx = idx % m + 1;
                if (idx != p) continue;
                if (answer.length() >= t) break;
                answer += str.substring(i, i+1);
            }
        }
        
        return answer.toUpperCase();
    }
}
/*
class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int num = 0;
        int idx = 0;
        
        String str = "";
        while (str.length() < t * n) {
            str += Integer.toString(num++, n);
        }
        
        for (int i = 0; i < t; i++) {
            answer += str.charAt(p - 1 + i * m);
        }
        
        return answer.toUpperCase();
    }
}
*/