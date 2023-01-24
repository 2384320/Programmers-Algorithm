class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] check = new int[200001];
        
        for (int i = 0; i < nums.length; i++) {
            check[nums[i]]++;
        }
        
        for (int i = 1; i < check.length; i++) {
            if (check[i] > 0) answer++;
        }
        return nums.length/2 < answer ? nums.length/2 : answer;
    }
}