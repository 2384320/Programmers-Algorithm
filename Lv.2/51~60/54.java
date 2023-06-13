class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for (int i = 1; i <= s.length()/2; i++) {
            StringBuilder sb = new StringBuilder();
            String str = s.substring(0, i);
            
            int count = 1;
            for (int j = i; j <= s.length(); j+=i) {
                int idx = Math.min(j + i, s.length());
                String str2 = s.substring(j, idx);
                if (str.equals(str2)) count++;
                else {
                    if (count >= 2) sb.append(count);
                    sb.append(str);
                    str = str2;
                    count = 1;
                }
            }
            sb.append(str);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}