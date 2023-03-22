// for 삼중 중첩
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i+1; j < number.length - 1; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}

// 백트래킹 이용
class Solution {
    public int[] nums;
    public boolean[] check;
    public int answer = 0;
    public int sum = 0;

    public int solution(int[] number) {
        nums = number;
        check = new boolean[number.length];
        
        dfs(0, 0);
        
        return answer;
    }
    
    public void dfs(int depth, int idx) {
        if (depth == 3) {
            for (int i = 0; i < nums.length; i++) {
                if (check[i]) sum += nums[i];
            }
            if (sum == 0) answer++;
            sum = 0;
        }
        
        for (int i = idx; i < nums.length; i++) {
            check[i] = true;
            dfs(depth + 1, i + 1);
            check[i] = false;
        }
    }
    
}