import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char chStart, chEnd;
        chEnd = words[0].charAt(words[0].length() - 1);
        
        HashSet<String> hs = new HashSet<>();
        hs.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            chStart = words[i].charAt(0);
            int sizeStart = hs.size();
            hs.add(words[i]);
            int sizeEnd = hs.size();
            
            if (chStart == chEnd && sizeStart + 1 == sizeEnd) {
                chEnd = words[i].charAt(words[i].length() - 1);
                continue;
            }
            
            answer[0] = i % n + 1;
            answer[1] = i / n + 1;
            break;
        }
        return answer;
    }
}