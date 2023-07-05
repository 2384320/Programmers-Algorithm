class Solution {
    private int count, answer;
    private char[] words = {'A', 'E', 'I', 'O', 'U'};
    public int solution(String word) {
        answer = 0;
        count = 0;
        dfs(0, word, "");
        return answer;
    }
    
    private void dfs(int depth, String word, String str) {
        if (depth <= 5 && depth > 0) {
            count++;
            if (str.equals(word)) answer = count;
        }
        
        if (depth > 5) return;
        
        for (int i = 0; i < 5; i++) {
            dfs(depth + 1, word, str + words[i]);
        }
    }
}