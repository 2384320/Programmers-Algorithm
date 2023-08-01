class Solution {
    public int solution(String s) {
        int length = s.length();
        int answer = length;
        
        for (int i = 1; i <= length / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String str = s.substring(0, i);
            
            int count = 1;
            for (int j = i; j <= length; j+=i) {
                int idx = Math.min(j + i, length);
                String str2 = s.substring(j, idx);
                
                if (str2.equals(str)) count++;
                else {
                    if (count >= 2) sb.append(count);
                    sb.append(str);
                    str = str2;
                    count = 1;
                }
            }
            sb.append(str);
            answer = Math.min(sb.length(), answer);
        }
        return answer;
    }
}