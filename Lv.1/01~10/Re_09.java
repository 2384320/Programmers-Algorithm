import java.util.Arrays;

class Solution {
    public String solution(String str) {
        char[] sol = str.toCharArray();
        char temp;
        for (int i = 0; i < sol.length - 1; i++) {
            for (int j = i + 1; j < sol.length; j++) {
                if (sol[i] < sol[j]) {
                    temp = sol[i];
                    sol[i] = sol[j];
                    sol[j] = temp;
                }
            }
        }
        return new String(sol);
    }
}