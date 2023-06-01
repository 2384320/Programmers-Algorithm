class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pSize = p.length();
        
        for (int i = pSize; i <= t.length(); i++) {
            if (Long.parseLong(t.substring(i - pSize, i)) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}