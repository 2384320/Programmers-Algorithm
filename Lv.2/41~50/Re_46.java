class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        
        int move = length - 1;
        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);
            answer += Math.min('Z' - ch + 1, ch - 'A');
            
            int index = i + 1;
            while (index < length && name.charAt(index) == 'A') {
                index++;
            }
            
            move = Math.min(move, Math.min((length - index) * 2 + i, i * 2 + length - index));
        }
        
        return answer + move;
    }
}