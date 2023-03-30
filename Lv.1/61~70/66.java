class Solution {
    public int solution(String s) {
        int answer = 0;
        String x = "", str;
        int xCount = 0, notXCount = 0, idx = 0;
        
        while (idx < s.length()) {
            str = s.substring(idx, idx+1);
            idx++;
            if (xCount == notXCount) {
                x = str;
                answer++;
                xCount = 1;
                notXCount = 0;
                continue;
            }
            
            if (x.equals(str)) xCount++;
            else notXCount++;
        }
        
        return answer;
    }
}