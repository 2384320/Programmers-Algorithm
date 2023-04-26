import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] stk;
        int i = 0;
        
        while (i < arr.length) {
            if (list.size() == 0) list.add(arr[i++]);
            else {
                if (list.get(list.size()-1) < arr[i]) list.add(arr[i++]);
                else list.remove(list.size()-1);
            }
        }
        
        stk = new int[list.size()];
        for (int idx = 0; idx < stk.length; idx++) {
            stk[idx] = list.get(idx);
        }
        return stk;
    }
}