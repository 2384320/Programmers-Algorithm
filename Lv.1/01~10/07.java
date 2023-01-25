import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String e1, String e2) {
                if (e1.charAt(n) == e2.charAt(n)) return e1.compareTo(e2);
                else return e1.charAt(n) - e2.charAt(n);
            }
        });
        
        return strings;
    }
}
