import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int ansInt, arrMax;
        int[] correct = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            ansInt = answers[i];
            if (ansInt == student1[i%student1.length]) correct[0]++;
            if (ansInt == student2[i%student2.length]) correct[1]++;
            if (ansInt == student3[i%student3.length]) correct[2]++;
        }
        
        arrMax = Math.max(correct[0], Math.max(correct[1], correct[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (arrMax == correct[i]) list.add(i+1);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}