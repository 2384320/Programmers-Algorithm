import java.util.*;

class Solution {
    public boolean[] primeArr;
    public int solution(int[] nums) {
        int answer = 0, sum;
        Arrays.sort(nums);
        primeArr = new boolean[nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]+1];

        is_prime(primeArr.length);
        
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (!primeArr[sum]) answer++;
                }
            }
        }

        return answer;
    }
    
    public void is_prime(int num) {
        if (num < 1) return;
        primeArr[0] = primeArr[1] = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (primeArr[i] == true) continue;
            for (int j = i * i; j < primeArr.length; j += i) {
                primeArr[j] = true;
            }
        }
    }
}