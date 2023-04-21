import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length], check = new int[10001];
        Arrays.fill(check, -1);

        for (int i = 0; i < numlist.length; i++) {
            check[numlist[i]] = Math.abs(numlist[i] - n);
        }

        for (int i = 0; i < answer.length; i++) {
            int num = 0, sub = 10000;
            for (int j = 1; j < check.length; j++) {
                if (check[j] != -1 && check[j] <= sub) {
                    sub = check[j];
                    num = j;
                }
            }
            answer[i] = num;
            check[num] = -1;
        }
        return answer;
    }
}