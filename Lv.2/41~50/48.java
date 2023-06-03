import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int start = 0;
        int end = people.length - 1;
        boolean[] rescue = new boolean[people.length];
        
        Arrays.sort(people);
        while (start < end) {
            if (people[start] + people[end] <= limit) {
                rescue[start++] = true;
                rescue[end--] = true;
                answer++;
            } else {
                end--;
            }
        }
        
        for (boolean isRescue : rescue) {
            if (!isRescue) answer++;
        }
        
        return answer;
    }
}