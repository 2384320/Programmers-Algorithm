class Solution {
    public int[] solution(String s) {
        int size = s.length();
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
            String str = s.substring(0, i);
            char ch = s.charAt(i);
            int idx = str.lastIndexOf(ch);
            
            if (idx == -1) answer[i] = -1;
            else answer[i] = i - idx;
        }
        
        return answer;
    }
}