import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> people = new ArrayList<>();
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            people.add(i);
        }
        
        k--;
        int answerIdx = 0;
        while (n > 0) {
            factorial /= n;
            int idx = (int) (k / factorial);
            answer[answerIdx++] = people.get(idx);
            people.remove(idx);
            k %= factorial;
            n--;
        }
        
        return answer;
    }
}