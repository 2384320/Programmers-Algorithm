import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] >= sides[0] + sides[1] ? 2 : 1;
	}
}
// 값이 바로 반환되도록 함.