import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int idx = j;
                int idxCount = 0;
                int sum = 0;
                while (idxCount < i) {
                    sum += elements[idx++];
                    idx %= elements.length;
                    idxCount++;
                }
                hs.add(sum);
            }
        }
        
        return hs.size();
    }
}