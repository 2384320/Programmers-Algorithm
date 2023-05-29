import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int size = citations.length;
        
        Arrays.sort(citations);
        for (int i = size; i > 0; i--) {
            if (citations[size - i] >= i) return i;
        }
        return 0;
    }
}