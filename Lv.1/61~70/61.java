import java.util.*;

class Solution {
    public int answer = 0;
    public List<Integer> list;
    
    public int solution(int[] ingredient) {
        list = new ArrayList<>();
        
        for (int i = 0; i < ingredient.length; i++) {
            checkHamburger(ingredient[i]);          
        }
        return answer;
    }
    
    public void checkHamburger(int ingre) {
        list.add(ingre);
        int size = list.size();
        
        if (size >= 4 && ingre == 1) {
            if (list.get(size-4) == 1 && list.get(size-3) == 2 && list.get(size-2) == 3) {
                list.remove(size-1);
                list.remove(size-2);
                list.remove(size-3);
                list.remove(size-4);
                answer++;
                return;
            }
        }
    }
}