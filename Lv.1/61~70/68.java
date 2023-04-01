class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pSize = p.length();
        
        for (int i = 0; i < t.length() - pSize + 1; i++) {
            if (Long.parseLong(t.substring(i, i + pSize)) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}