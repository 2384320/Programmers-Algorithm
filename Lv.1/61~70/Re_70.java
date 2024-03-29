class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for (char ch : s.toCharArray()) {
            char temp = ch;
            int cnt = 0;
            
            while (cnt < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) cnt++;

            }
            answer.append(temp);
        }
        
        return answer.toString();
    }
}