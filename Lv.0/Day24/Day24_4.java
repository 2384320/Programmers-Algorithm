class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            String str = Integer.toString(a);
            for (int b = 0; b < str.length(); b++) {
                int ch = str.charAt(b) - 48;
                if (ch == k) answer++;
            }
        }
        
        return answer;
    }
}