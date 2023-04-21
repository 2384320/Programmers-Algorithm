import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; (i*i) <= n; i++) {
            list.add(i*i);
        }
        
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) answer = 1;
            else answer = 2;
        }
        
        return answer;
    }
}
/* 수정본
class Solution {
    public int solution(int n) {
        int answer = 0;
        Double sqrt = Math.sqrt(n);
        if(sqrt == sqrt.intValue()) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
*/