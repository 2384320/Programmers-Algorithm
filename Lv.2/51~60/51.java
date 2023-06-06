class Solution {
    int count;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        count = 0;
        
        dfs(0, numbers, target, 0);
        
        answer = count;
        return answer;
    }
    
    private void dfs(int depth, int[] numbers, int target, int result) {
        if (depth == numbers.length) {
            if (result == target) count++;
            return;
        }
        
        dfs(depth + 1, numbers, target, result + numbers[depth]);
        dfs(depth + 1, numbers, target, result - numbers[depth]);
    }
}