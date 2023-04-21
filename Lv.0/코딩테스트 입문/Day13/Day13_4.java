import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0, max = 0, sum = 0;
        
        Arrays.sort(sides);
        if (sides[2] >= sides[0] + sides[1]) answer = 2;
        else answer = 1;
        
        return answer;
    }
}