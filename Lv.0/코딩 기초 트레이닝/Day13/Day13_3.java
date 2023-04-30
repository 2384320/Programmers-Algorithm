import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int existR = -1;
        int existL = -1;
        
        existR = Arrays.asList(str_list).indexOf("r");
        existL = Arrays.asList(str_list).indexOf("l");
        
        if (existL == -1 && existR == -1) return new String[] {};
        else if (existL != -1 && (existR > existL || existR == -1)) return Arrays.copyOfRange(str_list, 0, existL);
        else if (existR != -1 && (existR < existL || existL == -1)) return Arrays.copyOfRange(str_list, existR + 1, str_list.length);
        
        return new String[] {};
    }
}