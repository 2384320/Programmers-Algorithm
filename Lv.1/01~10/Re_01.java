import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hs = new HashSet<>();
        
        for (int num : nums) {
            hs.add(num);
        }
        answer = hs.size();

        return nums.length/2 < answer ? nums.length/2 : answer;
    }
}