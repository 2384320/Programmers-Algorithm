import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
			} 
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() >= 2) answer++;
        }
        
        return answer;
    }
}
// 201 크기의 배열을 삭제하고 유동적으로 변할 수 있도록 map 사용함.