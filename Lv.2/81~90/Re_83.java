import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        int length = ranges.length;
        double[] answer = new double[length];
        List<Integer> list = new ArrayList<>();
        
        while (k > 1) {
            list.add(k);
            if (k % 2 == 0) k /= 2;
            else k = k * 3 + 1;
        }
        list.add(k);
        int size = list.size();
        
        for (int i = 0; i < length; i++) {
            if (ranges[i][0] > ranges[i][1] + size - 1) {
                answer[i] = -1;
                continue;
            }
            
            double dimension = 0;
            for (int j = ranges[i][0]; j < ranges[i][1] + size - 1; j++) {
                dimension += (list.get(j) + list.get(j + 1)) / 2.0;
            }
            answer[i] = dimension;
        }
        
        return answer;
    }
}