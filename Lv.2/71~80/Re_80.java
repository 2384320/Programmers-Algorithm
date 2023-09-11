import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> hs = new HashSet<>();
    
        int length = elements.length;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = 0;
                for (int k = j; k < i + j; k++) {
                    sum += elements[k%length];
                }
                hs.add(sum);
            }
        }
        
        return hs.size();
    }
}