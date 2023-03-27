import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "", right = "", str = "";
        int count = 0, size = food.length;
        
        int[] foodArrange = new int[size];
        foodArrange[0] = 1;
        
        for (int i = 1; i < size; i++) {
            foodArrange[i] = food[i]/2;
        }
        
        for (int i = 1; i < size; i++) {
            count = 0;
            str = Integer.toString(i);
            while (count++ < foodArrange[i]) {
                
                answer = answer.concat(str);
                right = str.concat(right);
            }
        }
        
        answer = answer.concat("0").concat(right);
        return answer;
    }
}